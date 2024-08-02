package AdvancedTrees;

public class DiameterOfBT {

    public class TreeNode{
        TreeNode left;
        TreeNode right;
    }
        //LEETCODE 543
        //Diameter of binary tree
        int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftAns = height(node.left);
        int rightAns = height(node.right);

        int currDiam = leftAns + rightAns + 1;
        diameter = Math.max(diameter,currDiam);

        return Math.max(leftAns,rightAns) + 1;
    }



}
