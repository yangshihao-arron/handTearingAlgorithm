package y_2023.m3.week1.d3;

public class Offer26 {

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null)
            return false;
        return sameRootDFS(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public boolean sameRootDFS(TreeNode A, TreeNode B){
        if(B == null)
            return true;
        if(A == null || A.val != B.val)
            return false;
        return sameRootDFS(A.left, B.left) && sameRootDFS(A.right, B.right);
    }

}
