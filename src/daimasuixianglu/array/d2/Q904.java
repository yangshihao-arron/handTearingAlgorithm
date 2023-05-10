package daimasuixianglu.array.d2;

import java.util.Map;
import java.util.HashMap;

public class Q904 {

    public int totalFruit(int[] fruits) {
        int total = 0, left = 0;
        Map<Integer,Integer> record = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
           record.put(fruits[right], record.getOrDefault(fruits[right],0) + 1);
           while(record.size() > 2){
               record.put(fruits[left], record.get(fruits[left]) - 1);
               if(record.get(fruits[left]) == 0)
                   record.remove(fruits[left]);
               left++;
           }
           total = Math.max(total, right - left + 1);
        }
        return total;
    }
}
