package AdvancedTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelSuccessor {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public int nextElem(TreeNode root,int item){
        if(root == null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
                TreeNode currNode = queue.poll();
                if (currNode.left != null){
                    queue.offer(currNode.left);
                }

                if (currNode.right != null){
                    queue.offer(currNode.right);
                }

                if (currNode.val == item){
                    TreeNode ans = queue.poll();
                    return ans.val;
                }
        }
        return -1;
    }
}
