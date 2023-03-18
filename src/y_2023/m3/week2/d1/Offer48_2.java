package y_2023.m3.week2.d1;


import java.util.HashSet;
import java.util.Set;

public class Offer48_2 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int pre = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(pre++));
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }
}
