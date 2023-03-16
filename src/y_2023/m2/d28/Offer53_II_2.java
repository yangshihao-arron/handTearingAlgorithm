package y_2023.m2.d28;
//x ^ x = 0 ,x ^ 0 = x
public class Offer53_II_2 {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            xor ^= nums[i];
        }
        for(int i = 0; i <= n ;i++){
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        System.out.println(new Offer53_II_2().missingNumber(new int[]{0}));
    }
}
