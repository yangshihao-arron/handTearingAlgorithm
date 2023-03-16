package y_2023.m2.d28;



public class Offer53_II {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            if(nums[i] != i)
                return i;
        }
        return n;
    }


    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(new Offer53_II().missingNumber(nums));
    }
}
