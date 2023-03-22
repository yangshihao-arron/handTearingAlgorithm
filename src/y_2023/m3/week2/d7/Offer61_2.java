package y_2023.m3.week2.d7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Offer61_2 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = 0;
        for(int i = 0; i < 4; i++){
            if(nums[i] == 0)
                joker++;
            else if(nums[i] == nums[i + 1])
                return false;
        }
        return nums[4] - nums[joker] < 5;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,8,5,4};
        boolean res = new Offer61_2().isStraight(nums);
        System.out.println(res);
    }
}
