package p300.srm385;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 14.04.2008
 * Time: 7:56:31
 */
public class UnderscoreJustification {
    public String justifyLine(String[] words, int width) {
        int len = 0;
        for (String word : words) {
            len += word.length();
        }
        int n = words.length;
        int pad = (width - len) / (n - 1);
        int rest = (width - len) % (n - 1);
        int padding[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            padding[i] = pad;
        }
        for (int i = n - 1 - 1; rest > 0 && i >= 0; i--) {
            if (Character.isUpperCase(words[i].charAt(0))) {
                padding[i]++;
                rest--;
            }
        }
        for (int i = n - 1 - 1; rest > 0 && i >= 0; i--) {
            padding[i]++;
            rest--;
        }
        return toResult(words, padding);
    }

    private String toResult(String[] words, int[] padding) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result += word;
            if (padding[i] > 0) {
                for (int j = 0; j < padding[i]; j++) {
                    result += "_";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("A___quick__brown__fox__jumps__over__the__lazy__dog".equals(new UnderscoreJustification().justifyLine(
                new String[]{"A", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}, 50)));

        System.out.println("Alpha_Beta_Gamma__Delta__Epsilon".equals(new UnderscoreJustification().justifyLine(
                new String[]{"Alpha", "Beta", "Gamma", "Delta", "Epsilon"}, 32)));

        System.out.println("Hello____world___John____said".equals(new UnderscoreJustification().justifyLine(
                new String[]{"Hello", "world", "John", "said"}, 29)));
    }
}
