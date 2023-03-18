package y_2023.m3.week2.d3;

import java.util.HashSet;
import java.util.Set;

public class Offer52 {

     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode temp = headA;
         Set<ListNode> set = new HashSet<>();
         while(temp != null){
             set.add(temp);
             temp = temp.next;
         }
         temp = headB;
         while(temp != null){
             if(set.contains(temp))
                 return temp;
             temp = temp.next;
         }
         return null;
    }

}
