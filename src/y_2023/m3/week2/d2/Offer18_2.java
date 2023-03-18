package y_2023.m3.week2.d2;

public class Offer18_2 {
     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val)
            return head.next;
       ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }
        if(cur != null){
            pre.next = cur.next;
        }

        return head;
    }
}
