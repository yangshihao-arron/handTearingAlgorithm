package the_essential_version_of_the_interview.a1_arrayandstring;

import java.util.Arrays;

public class Q7 {

    public int[] productExceptSelf(int[] nums) {
        int[] res = Arrays.copyOf(nums, nums.length);
        for(int i = 0; i < res.length; i++){
            res[i] = multi(nums, i);
        }
        return res;
    }

    public int multi(int[] nums, int index){
        int res = 1;
        for(int i = 0; i < nums.length; i++){
            if(i == index)
                continue;
            res *= nums[i];
        }
        return res;
    }

}
