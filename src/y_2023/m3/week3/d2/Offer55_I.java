package y_2023.m3.week3.d2;

public class Offer55_I {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int max = 0;

    public int maxDepth(TreeNode root) {
        dfs(root, max);
        return max;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null)
            return;
        depth++;
        max = Math.max(max, depth);
        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}

