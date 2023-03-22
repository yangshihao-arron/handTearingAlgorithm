package y_2023.m3.week3.d1;

import java.util.Arrays;

public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length < k)
            return new int[0];
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

}
