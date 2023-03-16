package y_2023.m3.week1.d3;


public class Offer27 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode nodeLeft = mirrorTree(root.left);
        TreeNode nodeRight = mirrorTree(root.right);
        root.left = nodeRight;
        root.right = nodeLeft;
        return root;
    }

}
