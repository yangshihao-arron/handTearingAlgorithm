package y_2023.m3.week3.d7;

public class Q977_2 {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int nagative = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0)
                nagative++;
            else
                break;
        }
        int[] ans = new int[n];
        int index = 0, i = nagative, j = nagative + 1;
        while(i >= 0 || j < n){
            if(i < 0){
                ans[index] = nums[j] * nums[j];
                j++;
            }else if (j == n){
                ans[index] = nums[i] * nums[i];
                i--;
            }else if(nums[i] * nums[i] < nums[j] * nums[j]){
                ans[index] = nums[i] * nums[i];
                i--;
            }else{
                ans[index] = nums[j] * nums[j];
                j++;
            }
            index++;
        }
        return ans;

    }

}
