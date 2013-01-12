package p400.srm464;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 16.03.2010
 * Time: 18:00:19
 */
public class ColorfulBoxesAndBalls {

  public int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors) {
    return Math.max(getTotal(numRed, numBlue, onlyRed, onlyBlue, bothColors),
        getTotal(numBlue, numRed, onlyBlue, onlyRed, bothColors));
  }

  private int getTotal(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors) {
    int redBoxes = numRed;
    int blueBoxes = numBlue;

    int total = 0;
    for (int i = 0; i < numBlue; i++) {
      if ((onlyBlue > bothColors || redBoxes == 0) && blueBoxes > 0) {
        blueBoxes--;
        total += onlyBlue;
      } else {
        redBoxes--;
        total += bothColors;
      }
    }

    for (int i = 0; i < numRed; i++) {
      if ((onlyRed > bothColors || blueBoxes == 0) && redBoxes > 0) {
        redBoxes--;
        total += onlyRed;
      } else {
        blueBoxes--;
        total += bothColors;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(1400 == new ColorfulBoxesAndBalls().getMaximum(2, 3, 100, 400, 200));
    System.out.println(1600 == new ColorfulBoxesAndBalls().getMaximum(2, 3, 100, 400, 300));
  }
}
