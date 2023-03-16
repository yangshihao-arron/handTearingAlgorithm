package y_2023.m2.d28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Offer03 {
   Set<Integer> record;
    public int findRepeatNumber(int[] nums) {
        record = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(record.contains(nums[i]))
                return nums[i];
            else
                record.add(nums[i]);
        }
        return -1;
    }
}
