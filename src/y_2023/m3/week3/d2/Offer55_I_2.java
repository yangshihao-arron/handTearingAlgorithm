package y_2023.m3.week3.d2;

public class Offer55_I_2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 +  Math.max(maxDepth(root.left),maxDepth(root.right));
    }




}
