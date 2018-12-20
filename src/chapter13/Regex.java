package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static Pattern pattern = Pattern.compile("[aeiou]");

    public static void main(String[] args) {
        String s = "hello, i'm a good man.";
        Matcher matcher = pattern.matcher(s);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group().toUpperCase());
        }
        matcher.appendTail(sb);

        System.out.println(sb);

    }
}
