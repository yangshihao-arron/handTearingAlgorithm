package y_2023.m3.week1.d2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Offer32_I_2 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    Map<Integer, List<Integer>> map = new HashMap<>();
    int max = -1, cnt = 0;


    public int[] levelOrder(TreeNode root) {
        dfs(root,0);
        int[] res = new int[cnt];
        for(int i = 0,idx = 0; i <= max; i++){
            for(int x : map.get(i))
                res[idx++] = x;
        }
        return res;
    }
    public void  dfs(TreeNode root, int depth){
        if(root == null)
            return;
        max = Math.max(max, depth);
        cnt++;
        List<Integer> list = map.getOrDefault(depth,new ArrayList<>());
        list.add(root.val);
        map.put(depth,list);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
