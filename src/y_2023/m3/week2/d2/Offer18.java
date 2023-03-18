package y_2023.m3.week2.d2;

public class Offer18 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if(head == null)
            return head;
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        dummyHead.next = head;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
                return dummyHead.next;
            }
            temp = temp.next;
        }
        return dummyHead.next;
    }
}
