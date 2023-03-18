package y_2023.m3.week2.d4;

public class Offer57 {

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int[] res = new int[2];
        for(i = 0; i < j;){
            if(nums[i] + nums[j] == target){
                res[0] = nums[i];
                res[1] = nums[j];
                break;
            }else if(nums[i] + nums[j] < target){
                i++;
            }else
                j--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] res = new Offer57().twoSum(nums,9);
    }

}
