package daimasuixianglu.a2_linkedlist.d4;

public class Q203_2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        if(head == null)
            return head;


       if(head.val == val)
           return removeElements(head.next,val);
       head.next = removeElements(head.next,val);
       return head;
    }



}
