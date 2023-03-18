package y_2023.m3.week2.d4;

public class Offer21_2 {

    public int[] exchange(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int index = 0;
        for(int num : nums){
            if(num % 2 == 1)
                res[index++] = num;
        }
        for(int num : nums){
            if(num % 2 == 0)
                res[index++] = num;
        }

        return res;
    }

}
