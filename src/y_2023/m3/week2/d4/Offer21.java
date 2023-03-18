package y_2023.m3.week2.d4;

public class Offer21 {

    public int[] exchange(int[] nums) {
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] % 2) == 1){
                int temp = nums[pre];
                nums[pre] = nums[i];
                nums[i] = temp;
                pre++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        new Offer21().exchange(nums);
        for(int num : nums)
            System.out.print(num + " ");
    }

}
