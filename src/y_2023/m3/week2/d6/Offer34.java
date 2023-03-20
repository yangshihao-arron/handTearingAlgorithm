package y_2023.m3.week2.d6;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Offer34 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return res;
    }
    public void dfs(TreeNode root, int target){
        if(root == null)
            return;
        path.offerLast(root.val);
        target -= root.val;
        if(root.left == null && root.right == null && target == 0){
            res.add(new LinkedList<>(path));
        }
        dfs(root.left, target);
        dfs(root.right,target);
        path.pollLast();
    }
}
