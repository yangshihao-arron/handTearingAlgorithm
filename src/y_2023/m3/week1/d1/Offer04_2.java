package y_2023.m3.week1.d1;

public class Offer04_2 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int[] row : matrix){
            int index = search(row, target);
            if(index >= 0)
                return true;
        }
        return false;
    }
    public int search(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (high - low) / 2 + low;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
               high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
