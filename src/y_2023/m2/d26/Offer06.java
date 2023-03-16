package y_2023.m2.d26;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Offer06 {

    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        while(head != null){
            stack.push(head.val);
            head= head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = stack.get(i);
            System.out.println("get :" + stack.get(i) );
            //System.out.println("pop : " + stack.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node1  = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(2);
        node2.next = node3;
        new Offer06().reversePrint(node1);

    }
}
