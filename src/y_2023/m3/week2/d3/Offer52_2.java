package y_2023.m3.week2.d3;

import java.util.HashSet;
import java.util.Set;

public class Offer52_2 {

     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA == null || headB == null)
             return null;
         ListNode pA = headA, pB = headB;
         while(pA != pB){
             pA = pA == null ? headB : pA.next;
             pB = pB == null ? headA : pB.next;
         }
         return pA;
    }

}
