package y_2023.m3.week2.d4;

public class Offer21_4 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            while(left < right && nums[left] % 2 == 1){
                left ++;
            }
            while(left < right && nums[right] % 2 == 0){
                right --;
            }
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
