package AdvancedTrees;

public class IsValidBST {
    //LEETCODE 98
    //Validate Binary Search Tree

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean isValidBST(TreeNode root){
        return check(root,null,null);
    }

    public boolean check(TreeNode node,Integer low,Integer high){
        if(node == null){
          return true;
        }

        if(low != null && node.val <= low){
            return false;
        }

        if(high != null && node.val >= high){
            return false;
        }

        return check(node.left,low, node.val) && check(node.right,node.val,high);
    }
}
