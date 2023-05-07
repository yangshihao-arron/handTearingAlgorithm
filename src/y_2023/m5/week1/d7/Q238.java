package y_2023.m5.week1.d7;

public class Q238 {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] l = new int [n], r = new int[n];
        l[0] = 1;
        r[n - 1] = 1;
        for(int i = 1; i < n; i++){
            l[i] = l[i-1] * nums[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            r[i] = r[i+1] * nums[i+1];
        }
        for(int i = 0; i < n; i++){
            nums[i] = l[i] * r[i];
        }
        return nums;
    }

}
