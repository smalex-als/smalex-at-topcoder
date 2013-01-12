package p300.srm376;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 20.01.2008
 * Time: 17:30:16
 */
public class PunctuationCleaner {
    public String clearExcess(String document) {
        StringBuilder sb = new StringBuilder(document);
        final Pattern pattern = Pattern.compile("[!?]{2,}");
        final Matcher matcher = pattern.matcher(sb);

        int start = 0;
        while (matcher.find(start)) {
            sb.replace(matcher.start(), matcher.end(), matcher.group().contains("?") ? "?" : "!");
            start = matcher.start() + 1;
        }
        return sb.toString();
    }

    public String clearExcess2(String document) {
        StringBuilder sb = new StringBuilder(document);
        int start = sb.indexOf("!");
        while (start != -1) {
            int idx = start;
            char c;
            do {
                idx++;
                if (idx >= sb.length()) {
                    break;
                }
                c = sb.charAt(idx);
            } while (c == '!' || c == '?');
            final String chunk = sb.substring(start, idx);
            char replaceWith = '!';
            if (chunk.indexOf('?') != -1) {
                replaceWith = '?';
            }
            sb.replace(start, idx, "" + replaceWith);
            start = getFirstChar(sb, start + 1);
        }
        return sb.toString();
    }

    private int getFirstChar(StringBuilder sb, int idx) {
        int start0 = sb.indexOf("!", idx);
        int start1 = sb.indexOf("?", idx);
        if (start0 == -1) return start1;
        if (start1 == -1) return start0;
        return Math.min(start0, start1);
    }

    public static void main(String[] args) {
        
        System.out.println("This cheese is really great!".equals(new PunctuationCleaner().clearExcess("This cheese is really great!!!!!")));
        System.out.println("You really like THIS cheese?".equals(new PunctuationCleaner().clearExcess("You really like THIS cheese!?!?!?!!!?")));
        System.out.println(" ?X! ? This is delicious! ?a?".equals(new PunctuationCleaner().clearExcess(" !!?X! ?? This is delicious!!! ??!a!?!")));

    }
}
