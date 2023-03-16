package y_2023.m3.week1.d1;

import java.util.HashMap;
import java.util.Map;

public class Offer50 {
    public char firstUniqChar(String s) {
        if(s.length() == 0)
            return ' ';
        Map<Character, Integer> record = new HashMap<>();
        for(char c : s.toCharArray()){
            record.put(c,record.getOrDefault(c,0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(record.get(s.charAt(i)) == 1)
                return s.charAt(i);
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "leetcode";
        char c = new Offer50().firstUniqChar(s);
        System.out.println(c);
    }
}
