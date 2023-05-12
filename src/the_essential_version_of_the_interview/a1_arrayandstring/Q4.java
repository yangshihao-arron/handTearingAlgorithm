package the_essential_version_of_the_interview.a1_arrayandstring;

public class Q4 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0] == 0)
            return true;

        for(int i = 0; i < flowerbed.length;){
            if(i == 0){
                if(flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    i++;
                }
            }else if(i < flowerbed.length - 1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    i++;
                }
            }else if(i == flowerbed.length - 1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                    n--;
                    i++;
                }
            }
            i++;

            if(n <= 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0};
        int n = 1;
        boolean res = new Q4().canPlaceFlowers(flowerbed,n);
        System.out.println(res);
    }

}
