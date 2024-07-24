package AdvancedTrees;

import java.util.*;
public class TreeRightSideView {

    //LEETCODE 199
    //Binary Tree Right Side View
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode currNode = root;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i = 0;i < levelSize;i++){
                currNode = queue.poll();
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            list.add(currNode.val);
        }
        return list;
    }
}
