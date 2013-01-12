package p400.srm412;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 31.07.2008
 * Time: 15:10:43
 */
public class BirthdayReminders {
  public String[] remind(String[] friendNames, int[] birthDates, int currentDate, String[] occasions, int[] days, int k) {
    List<Integer> dates = getDates(birthDates, currentDate, days, k);
    List<String> result = new ArrayList<String>();
    for (int date : dates) {
      for (int j = 0; j < days.length; j++) {
        int day = days[j];
        for (int i = 0; i < birthDates.length; i++) {
          int birthDate = birthDates[i];
          if ((date - birthDate) % day == 0) {
            result.add(String.format("%d. %s %s (%d)", date, friendNames[i], occasions[j], (date - birthDate) / day));
            if (result.size() == k) {
              return result.toArray(new String[result.size()]);
            }
          }
        }
      }
    }
    return result.toArray(new String[result.size()]);
  }

  private List<Integer> getDates(int[] birthDates, int currentDate, int[] days, int k) {
    List<Integer> dates = new ArrayList<Integer>();
    for (int j = 0; j < k; j++) {
      for (int day : days) {
        for (int birthDate : birthDates) {
          int date = getStartDate(currentDate, day, birthDate, j);
          if (!dates.contains(date)) {
            dates.add(date);
          }
        }
      }
    }
    Collections.sort(dates);
    return dates.subList(0, k);
  }

  private int getStartDate(int currentDate, int day, int birthDate, int year) {
    while (birthDate < currentDate) {
      birthDate += day;
    }
    return birthDate + year * day;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.equals(new String[]{
        "515. Bill birthday (1)",
        "562. John binary birthday (1)",
        "612. Jack binary birthday (1)",
        "662. Bill binary birthday (1)",
        "780. John birthday (2)",
        "830. Jack birthday (2)",
        "880. Bill birthday (2)",
        "1050. John decimal birthday (1)",
        "1074. John binary birthday (2)",
        "1100. Jack decimal birthday (1)"},
        new BirthdayReminders().remind(new String[]{"John", "Jack", "Bill"},
            new int[]{50, 100, 150},
            500,
            new String[]{"birthday", "decimal birthday", "binary birthday"},
            new int[]{365, 1000, 512},
            10)));

    System.out.println(Arrays.equals(new String[]{
        "24. Zero threeday (8)",
        "24. Three threeday (7)",
        "24. Zero twoday (12)",
        "24. Two twoday (11)",
        "25. Three twoday (11)",
        "26. Two threeday (8)",
        "26. Zero twoday (13)",
        "26. Two twoday (12)",
        "27. Zero threeday (9)",
        "27. Three threeday (8)"},
        new BirthdayReminders().remind(new String[]{"Zero", "Two", "Three"},
            new int[]{0, 2, 3}, 24, new String[]{"threeday", "twoday"}, new int[]{3, 2}, 10)));


    System.out.println(Arrays.equals(new String[]{
        "14130. Angelina Jolie Venus year (54)",
        "14190. Paris Hilton Venus year (45)",
        "14208. Britney Spears Earth year (27)",
        "14253. Britney Spears Venus year (44)",
        "14260. Jessica Alba Venus year (45)",
        "14285. Paris Hilton Earth year (28)",
        "14346. Angelina Jolie Mars year (18)",
        "14355. Angelina Jolie Venus year (55)",
        "14355. Jessica Alba Earth year (28)",
        "14370. Paris Hilton Mars year (15)",
        "14390. Angelina Jolie Earth year (34)",
        "14415. Paris Hilton Venus year (46)",
        "14440. Jessica Alba Mars year (15)",
        "14478. Britney Spears Venus year (45)",
        "14485. Jessica Alba Venus year (46)",
        "14573. Britney Spears Earth year (28)",
        "14580. Angelina Jolie Venus year (56)",
        "14640. Paris Hilton Venus year (47)",
        "14650. Paris Hilton Earth year (29)",
        "14658. Britney Spears Mars year (15)"},
        new BirthdayReminders().remind(new String[]{"Jessica Alba", "Angelina Jolie", "Paris Hilton",
                                                    "Britney Spears"}, new int[]{4135, 1980, 4065, 4353}, 14091,
            new String[]{"Venus year", "Earth year", "Mars year", "Jupiter year", "Saturn year"},
            new int[]{225, 365, 687, 4332, 10760}, 20)));
  }
}
