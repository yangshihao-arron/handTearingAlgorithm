package daimasuixianglu.a1_array.d2;

public class Q209 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE, left = 0, sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }

        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1, 2, 3, 4, 5};
        int res = new Q209().minSubArrayLen(target, nums);
        System.out.println(res);
    }
}
