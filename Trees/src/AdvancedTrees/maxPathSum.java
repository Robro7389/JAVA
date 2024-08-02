package AdvancedTrees;

public class maxPathSum {

    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }

    //LEETCODE 124
    //Max Path Sum
    //Companies: Facebook

    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    public int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int currSum = left + right + node.val;
        ans = Math.max(currSum,ans);

        return Math.max(left,right) + node.val;
    }
}
