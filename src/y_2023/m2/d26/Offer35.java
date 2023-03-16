package y_2023.m2.d26;

import java.util.HashMap;
import java.util.Map;



public class Offer35 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node cur = head;
        Map<Node, Node> record = new HashMap<>();
        while (cur != null) {
            record.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            record.get(cur).next = record.get(cur.next);
            record.get(cur).random = record.get(cur.random);
            cur = cur.next;
        }
        return record.get(head);
    }
}
