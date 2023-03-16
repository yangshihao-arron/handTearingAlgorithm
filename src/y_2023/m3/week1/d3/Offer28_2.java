package y_2023.m3.week1.d3;

import java.util.LinkedList;
import java.util.Queue;

public class Offer28_2 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
         return check(root, root);
    }
    public boolean check(TreeNode p, TreeNode q){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){
            p = queue.remove();
            q = queue.remove();
            if(p == null && q == null)
                continue;
            if(p == null || q == null || p.val != q.val)
                return false;
            queue.add(p.left);
            queue.add(q.right);
            queue.add(p.right);
            queue.add(q.left);
        }
        return true;
    }
}
