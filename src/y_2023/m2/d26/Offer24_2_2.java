package y_2023.m2.d26;

public class Offer24_2_2 {

     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode retNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return retNode;
    }
}
