package y_2023.m3.week3.d3;

public class Offer68_I {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
         else if(root.val > p.val &&root.val > q.val)
             return lowestCommonAncestor(root.left, p, q);
         else
             return root;
    }
}
