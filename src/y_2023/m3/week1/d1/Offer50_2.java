package y_2023.m3.week1.d1;

import java.util.HashMap;
import java.util.Map;

public class Offer50_2 {
    public char firstUniqChar(String s) {
        Map<Character, Integer> record = new HashMap<>(32);
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(record.containsKey(c))
                record.put(c,-1);
            else
                record.put(c,i);
        }
        int firstIndex = n;
        for (Map.Entry<Character, Integer> entry : record.entrySet()) {
            int index = entry.getValue();
            if (index != -1 && index < firstIndex) {
                firstIndex = index;
            }
        }
        return firstIndex == n ? ' ' : s.charAt(firstIndex);

    }

}
