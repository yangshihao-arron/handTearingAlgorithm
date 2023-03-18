package y_2023.m3.week2.d4;

public class Offer21_3 {
    public int[] exchange(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int left = 0, right = n - 1;
        for(int num : nums){
            if(num % 2 == 1)
                res[left++] = num;
            else
                res[right--] = num;
        }
        return res;
    }
}
