package AdvancedTrees;

    //LEETCODE 104
    //Maximum depth of binary tree

public class maxDepth {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftAns = maxDepth(root.left);
        int rightAns = maxDepth(root.right);

        return Math.max(leftAns,rightAns) + 1;
    }
}
