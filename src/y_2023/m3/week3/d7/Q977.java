package y_2023.m3.week3.d7;

import java.util.Arrays;

public class Q977 {

    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
