package y_2023.m3.week2.d2;

public class Offer22 {
     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
         ListNode temp = head;
         int sum = 0;
         while(temp != null){
             sum++;
             temp = temp.next;
         }
         if(k > sum)
             return null;
         for(int i = 0; i < sum - k; i++){
             head = head.next;
         }
         return head;
    }
}
