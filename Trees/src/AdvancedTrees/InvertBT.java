package AdvancedTrees;

public class InvertBT {

    //LEETCODE 226
    //Invert Binary Tree

    public class TreeNode{
        TreeNode left;
        TreeNode right;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        if(root.left == null && root.right == null){
            return root;
        }

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
