package y_2023.m3.week1.d2;

import java.util.*;

public class Offer32_III {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)
            return res;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean isOrderLeft = true;

        while(!queue.isEmpty()){
            Deque<Integer> levelList = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if(isOrderLeft){
                    levelList.addLast(node.val);
                }else{
                    levelList.addFirst((node.val));
                }
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            res.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return res;
    }
}
