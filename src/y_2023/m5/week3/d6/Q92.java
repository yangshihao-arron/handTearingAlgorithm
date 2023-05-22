package y_2023.m5.week3.d6;

public class Q92 {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        // 第 1 步：从虚拟头节点走 left - 1 步，来到 left 节点的前一个节点
        for(int i = 0; i < left-1; i++){
            pre = pre.next;
        }

        // 第 2 步：从 pre 再走 right - left + 1 步，来到 right 节点
        ListNode rightNode = pre;
        for(int i = left -1; i < right; i++){
            rightNode = rightNode.next;
        }

        // 第 3 步：切断出一个子链表（截取链表）
        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        // 注意：切断链接
        pre.next = null;
        rightNode.next = null;

        // 第 4 步：同第 206 题，反转链表的子区间
        reverseLinkedList(leftNode);

        // 第 5 步：接回到原来的链表中
        pre.next = rightNode;
        leftNode.next = curr;
        return dummy.next;

    }

    private void reverseLinkedList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode pre = null, cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

    public ListNode init(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        return head;
    }

    public static void main(String[] args) {
        Q92 q92 = new Q92();
        ListNode head = q92.init();
//        while(head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println("null");
        ListNode res = q92.reverseBetween(head,2,4);
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

}
