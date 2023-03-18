package y_2023.m3.week2.d1;

import java.util.ArrayList;
import java.util.List;

public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < s.length(); i++){
            while(list.contains(chars[i]))
                list.remove(0);
            list.add(chars[i]);
            max = Math.max(max, list.size());
        }
        return max;
    }
}
