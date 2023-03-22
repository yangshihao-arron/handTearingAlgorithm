package y_2023.m3.week2.d7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Offer61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for(int num : nums){
            if(num == 0) continue;;
            max = Math.max(max, num);
            min = Math.min(min, num);
            if(repeat.contains(num))return false;
            repeat.add(num);
        }
        return max - min < 5;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,8,5,4};
        boolean res = new Offer61().isStraight(nums);
        System.out.println(res);
    }
}
