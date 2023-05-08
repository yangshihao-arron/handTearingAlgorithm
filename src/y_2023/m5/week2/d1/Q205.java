package y_2023.m5.week2.d1;

import java.util.HashMap;
import java.util.Map;

public class Q205 {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> s2t = new HashMap<>();
        Map<Character,Character> t2s = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if((s2t.containsKey(ss) && s2t.get(ss) != tt) || (t2s.containsKey(tt) && t2s.get(tt)!= ss))
                return false;
            else {
                s2t.put(ss,tt);
                t2s.put(tt,ss);
            }
        }
        return true;

    }
}
