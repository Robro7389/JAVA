package AdvancedTrees;
import java.util.*;

public class IsCousins {

    //LEETCODE 993
    //Cousins in binary tree
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int check = 0;
        while(!queue.isEmpty()){

            check = 0;
            int levelSize = queue.size();
            for(int i = 0;i < levelSize;i++){
                TreeNode node = queue.poll();
                if(node.val == x || node.val == y){
                    check++;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                if(node.left != null && node.right != null){
                    if(node.left.val == x && node.right.val == y){
                        return false;
                    }
                    if(node.left.val == y && node.right.val == x){
                        return false;
                    }
                }
            }
            if(check == 2){
                return true;
            }
            check = 0;
        }
        return false;
    }
}
