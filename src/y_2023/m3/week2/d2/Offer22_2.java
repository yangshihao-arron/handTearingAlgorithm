package y_2023.m3.week2.d2;

public class Offer22_2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
       ListNode slow = head, fast = head;
       while(k > 0){
           fast = fast.next;
           k--;
       }
       while(fast != null){
           fast = fast.next;
           slow = slow.next;
       }
       return slow;
    }


}
