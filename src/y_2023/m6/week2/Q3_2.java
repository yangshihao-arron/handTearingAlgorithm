package y_2023.m6.week2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q3_2 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                // s = abba这个例子
                //start =map.get(alpha);
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(alpha, end + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abba";
        Q3_2 q32 = new Q3_2();
        int res = q32.lengthOfLongestSubstring(s);
        System.out.println(res);
    }

}
