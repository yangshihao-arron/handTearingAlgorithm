package y_2023.m3.week1.d5;

public class Offer42 {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int[] dp = new int [len];
        dp[0] = nums[0];
        for(int i = 1; i < len; i++){
            dp[i] = Math.max(dp[i - 1], 0) + nums[i];
            System.out.println(String.format("dp[%d] = %d", i, dp[i]));
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        int res = new Offer42().maxSubArray(nums);
        System.out.println(res);
    }

}
