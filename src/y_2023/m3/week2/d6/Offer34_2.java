package y_2023.m3.week2.d6;


import java.util.*;

public class Offer34_2 {
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
    Map<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root == null)
            return res;

        Queue<TreeNode> queueNode = new LinkedList<>();
        Queue<Integer> queueSum = new LinkedList<>();
        queueNode.offer(root);
        queueSum.offer(0);
        while(!queueNode.isEmpty()){
            TreeNode node = queueNode.poll();
            int rec = queueSum.poll() + node.val;
            if(node.left == null && node.right == null){
                if(rec == target){
                    getPath(node);
                }
            } else{
                if(node.left != null){
                    map.put(node.left, node);
                    queueNode.offer(node.left);
                    queueSum.offer(rec);
                }
                if(node.right != null){
                    map.put(node.right, node);
                    queueNode.offer(node.right);
                    queueSum.offer(rec);
                }
            }
        }
        return res;

    }
    public void getPath(TreeNode node){
        List<Integer> temp = new LinkedList<>();
        while(node != null){
            temp.add(node.val);
            node = map.get(node);
        }
        Collections.reverse(temp);
        res.add(new LinkedList<>(temp));

    }

}
