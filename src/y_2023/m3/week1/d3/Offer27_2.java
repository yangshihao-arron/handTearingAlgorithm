package y_2023.m3.week1.d3;

import java.util.Deque;
import java.util.LinkedList;

public class Offer27_2 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null)
            return null;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.add(root); //添加到队尾
        while(!stack.isEmpty()){
            TreeNode node = stack.pop(); //从队头先出
            if(node.left != null)
                stack.add(node.left);
            if(node.right != null)
                stack.add(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }

}
