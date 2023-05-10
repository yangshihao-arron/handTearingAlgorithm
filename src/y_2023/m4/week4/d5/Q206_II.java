package y_2023.m4.week4.d5;

public class Q206_II {
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

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return res;
    }
}
