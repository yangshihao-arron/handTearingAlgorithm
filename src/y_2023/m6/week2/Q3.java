package y_2023.m6.week2;

import java.util.HashSet;
import java.util.Set;

public class Q3 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> records = new HashSet<>();
        int pre = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (records.contains(c)) {
                records.remove(s.charAt(pre));
                pre++;
            }

            records.add(c);
            max = Math.max(max, records.size());
        }
        return max;
    }

}
