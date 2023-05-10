package algorithm_Interview_java.c2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Q1451 {
    public String arrangeWords(String text) {
        String[] s = text.toLowerCase().split(" ");
        Arrays.sort(s, Comparator.comparingInt(String::length));
        s[0] = s[0].substring(0,1).toUpperCase() + s[0].substring(1);
        return String.join(" ", s);
    }

    public static void main(String[] args) {
        String text = "To be or not to be";
        String res = new Q1451().arrangeWords(text);
        System.out.println(res);
    }
}
