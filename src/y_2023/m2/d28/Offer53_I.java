package y_2023.m2.d28;

public class Offer53_I {
    int total;
    public int search(int[] nums, int target) {
        binarySearch(nums,target, 0, nums.length-1);
        return total;
    }

    public void binarySearch(int[] nums, int target, int left, int right){
        if(left > right)
            return;
        int mid = (right - left) / 2 + left;
        if(nums[mid] == target){
            total++;
            binarySearch(nums,target, left, mid-1);
            binarySearch(nums, target,mid + 1, right);
        }else if (nums[mid] < target){
            binarySearch(nums,target,mid + 1, right);
        }else{
            binarySearch(nums,target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums =  {5,7,7,8,8,10};
        System.out.println(new Offer53_I().search(nums,8));
    }
}
