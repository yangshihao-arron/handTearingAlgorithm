package daimasuixianglu.array.d1;

public class Q35 {
    public int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
                ans = left;
            }else{
                right = mid - 1;
            }
        }

        return ans;
    }
}
