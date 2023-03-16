package y_2023.m3.week1.d2;

import java.util.ArrayList;
import java.util.List;

public class Offer32_II_2 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return res;
        dfs(root,0);
        return res;
    }
    public void dfs(TreeNode root , int depth){
        if(root == null)
            return ;
        if(res.size() == depth){
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.val);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }

}
