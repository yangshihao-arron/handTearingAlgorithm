package y_2023.m5.week3.d6;

import java.util.HashSet;
import java.util.Set;

public class Q142 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        ListNode cur = head;
        while(cur != null){
            if(seen.contains(cur))
                return cur;
            seen.add(cur);
            cur =  cur.next;
        }
        return null;
    }

}
