package y_2023.m5.week2.d1;

/*
根据异或运算定义，若整数 x⊕y 某二进制位为 1,则 x 和 y 的此二进制位一定不同。换言之，找到 x⊕y 某为1的二进制位
即可将数组 nums 拆分为上述的两个子数组。根据与运算特点，可知对于任意整数a 有：
若a&0001=1 ，则a 的第一位为1
若a&0010=1 ，则a 的第二位为1

 */

public class Offer56_I {
//    public int[] singleNumbers(int[] nums) {
//        int x = 0, y = 0, n = 0, m = 1;
//        for(int num : nums){
//            n ^= num;
//        }
//        while((n & m) == 0)
//            m <<= 1;
//        for(int num : nums){
//            if((num & m) == 0)
//                x ^= num;
//            else
//                y ^= num;
//        }
//        return new int[]{x, y};
//    }

    public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, n = 0, m = 1;
        for(int num : nums)
            n ^= num;
        while((n & m) == 0){
            m <<= 1;
        }
        for(int num : nums){
            if((num & m) == 0)
                x ^= num;
            else
                y ^= num;
        }
        return new int[]{x, y};
    }

}
