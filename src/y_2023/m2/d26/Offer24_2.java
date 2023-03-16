package y_2023.m2.d26;

public class Offer24_2 {
     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
         if(head == null)
             return null;
         if(head.next != null){
             ListNode retNode = reverseList(head.next);
             head.next.next = head;
             head.next = null;
             return retNode;
         }else{
             return head;
         }

    }
}
