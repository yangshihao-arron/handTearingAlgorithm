package y_2023.m3.week2.d7;

import java.util.Arrays;

public class Offer45_2 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(x, y) ->(x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for(String s :strs)
            res.append(s);
        return res.toString();
    }

}
