package y_2023.m3.week2.d6;



public class Offer36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if(root == null)
            return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;

    }
    public void dfs(Node cur){
        if(cur == null)
            return;
        dfs(cur.left);
        if(pre != null)
            pre.right = cur;
        else
            head = cur;
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
