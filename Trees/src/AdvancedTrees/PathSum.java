package AdvancedTrees;

public class PathSum {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }

    //LEETCODE 112
    //Path Sum
    //Companies: Amazon

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null && root.val == targetSum){
            return true;
        }

        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}
