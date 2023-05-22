package y_2023.m5.week3.d6;

public class Q92_2 {
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

    /*
        curr：指向待反转区域的第一个节点 left；
        next：永远指向 curr 的下一个节点，循环过程中，curr 变化以后 next 会变化；
        pre：永远指向待反转区域的第一个节点 left 的前一个节点，在循环过程中不变。
     */

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        for(int i = 1; i < left; i++){
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        for(int i = left; i < right; i++){

            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;

        }
        return dummy.next;

    }

}
