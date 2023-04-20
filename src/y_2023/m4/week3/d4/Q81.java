package y_2023.m4.week3.d4;

public class Q81 {
    public boolean search(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(nums[mid] == target)
                return true;
            while(left <= mid && nums[left] == nums[mid])
                left++;
            if(left > mid ){
                left = mid + 1;
                continue;
            }
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }else{
                if(nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        boolean res = new Q81().search(nums, target);
        System.out.println(res);
    }
}
