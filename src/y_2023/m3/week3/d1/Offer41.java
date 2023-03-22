package y_2023.m3.week3.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Offer41 {

    //大顶堆存储较小一半的值
    PriorityQueue<Integer> maxHeap;
    //小顶堆存储较大一半的值
    PriorityQueue<Integer> minHeap;

    public Offer41() {
        maxHeap = new PriorityQueue<>((x,y) ->(y - x));
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        //长度为奇数时先放入小顶堆，重新排序后插入大顶堆
        if(maxHeap.size() != minHeap.size()){
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }else {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
    }

    public double findMedian() {
        if(maxHeap.size() != minHeap.size()){
            return minHeap.peek() / 1.0;
        }else{
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }

    }
}
