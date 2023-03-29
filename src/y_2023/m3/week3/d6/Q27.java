package y_2023.m3.week3.d6;

public class Q27 {

    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int x : nums){
            if(x != val)
                nums[idx++] = x;
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int res = new Q27().removeElement(nums,3);
        String s = "acb";
        StringBuilder sb = new StringBuilder();
    }

}
