package y_2023.m2.d26;


import java.util.ArrayList;
import java.util.List;

public class Offer06_2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    List<Integer> temp = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[temp.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = temp.get(i);
        }
        return res;
    }
    public void recur(ListNode head){
        if(head == null)
            return;
        recur(head.next);
        temp.add(head.val);

    }
}
