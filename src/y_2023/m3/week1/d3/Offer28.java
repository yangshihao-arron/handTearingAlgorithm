package y_2023.m3.week1.d3;

public class Offer28 {

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
         if(p == null && q == null)
             return true;
         if(p == null || q == null)
             return false;
         return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

}
