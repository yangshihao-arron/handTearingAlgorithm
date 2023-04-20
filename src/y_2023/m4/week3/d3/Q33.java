package y_2023.m4.week3.d3;

public class Q33 {

    public int search(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;
        int n = nums.length;
        if(n == 1)
            return nums[0] == target ? 0 : -1;
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = (r - l) / 2 + l;
            if(nums[mid] == target)
                return mid;
            if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target < nums[mid]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[r]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1};
        int target = 1;
        int res = new Q33().search(nums, target);
        System.out.println(res);
    }

}
