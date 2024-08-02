package AdvancedTrees;
import java.util.*;

public class ZigZagLevelOrder {

    //LEETCODE 103
    //Binary Tree Zigzag Level Order Traversal
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.offerFirst(root);
        boolean check = false;
        while(!deque.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int levelSize = deque.size();
            if(!check){
                for(int i = 0;i < levelSize;i++){
                    TreeNode currNode = deque.pollFirst();
                    list.add(currNode.val);
                    if(currNode.left != null){
                        deque.addLast(currNode.left);
                    }
                    if(currNode.right != null){
                        deque.addLast(currNode.right);
                    }
                }
                check = true;
            }
            else{
                for(int i= 0;i < levelSize;i++){
                    TreeNode currNode = deque.pollLast();
                    list.add(currNode.val);
                    if(currNode.right != null){
                        deque.addFirst(currNode.right);
                    }
                    if(currNode.left != null){
                        deque.addFirst(currNode.left);
                    }

                }
                check = false;
            }
            result.add(list);
        }


        return result;
    }
}
