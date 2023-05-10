package y_2023.m4.week4.d5;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public class Q92 {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (left == right)
                return head;
            int preLeft = 0, nextRight = 0;
            ListNode preLeftNode = null, nextRightNode = null, cur = head;
            for (int i = 1; i < left; i++) {
                preLeftNode = cur;
                cur = cur.next;
            }
            for (int i = left; i < right; i++) {
                nextRightNode = cur;
                cur = cur.next;
            }
            nextRightNode.next = null;
            nextRightNode = cur;
            ListNode subHeadNode = reverseList(preLeftNode.next);
            preLeftNode.next = subHeadNode;

            return null;
        }

        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode pre = null, cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }
    }
}
