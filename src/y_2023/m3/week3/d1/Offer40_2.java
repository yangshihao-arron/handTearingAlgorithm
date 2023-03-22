package y_2023.m3.week3.d1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer40_2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length < k)
            return new int[0];
       int[] res = new int[k];
       if(k == 0)
           return res;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0; i < k; i++){
            queue.offer(arr[i]);
        }
        for(int i = k ; i < arr.length; i++){
            if(queue.peek() > arr[i]){
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for(int i = 0; i < k ;i ++)
            res[i] = queue.poll();
        return res;
    }

}
