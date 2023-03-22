package y_2023.m3.week3.d2;

public class Offer55_II {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        else return Math.abs(height(root.left) - height(root.right)) <=1  && isBalanced(root.left) && isBalanced(root.right) ;
    }

    public int height(TreeNode root){
        if(root == null)
            return 0;
        else
            return Math.max(height(root.left), height(root.right)) + 1;
    }




}
