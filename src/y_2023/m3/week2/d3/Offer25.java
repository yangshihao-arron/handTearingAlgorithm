package y_2023.m3.week2.d3;

public class Offer25 {

     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode dummyHead = new ListNode(0);
         ListNode temp = dummyHead;
         while (l1 != null && l2 != null){
             if(l1.val < l2.val){
                 temp.next = l1;
                 l1 = l1.next;
             }else{
                 temp.next = l2;
                 l2 = l2.next;
             }
             temp = temp.next;
         }
         if(l1 != null)
             temp.next = l1;
         else
             temp.next = l2;
         return dummyHead.next;
    }

}
