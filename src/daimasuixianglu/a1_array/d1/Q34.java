package daimasuixianglu.a1_array.d1;

public class Q34 {

    public int[] searchRange(int[] nums, int target) {

        int[] res = {-1, -1};
        if (nums == null || nums.length == 0)
            return res;

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                int first = mid, last = mid;
                while (first > 0 && nums[first - 1] == target)
                    first--;
                while (last < nums.length - 1 && nums[last + 1] == target)
                    last++;
                res[0] = first;
                res[1] = last;
                return res;
            }
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return res;

    }
}
