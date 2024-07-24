package AdvancedTrees;

public class TreeToLinkedList {

    //LEETCODE 114
    //Flatten Binary Tree to Linked List

    //Companies:META

    public class TreeNode{
        TreeNode left;
        TreeNode right;
    }

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            return;
        }

        flatten(root.left);
        flatten(root.right);

        if(root.left != null){
            TreeNode temp = goRight(root.left);
            temp.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        return;
    }

    public TreeNode goRight(TreeNode node){
        if(node.right == null){
            return node;
        }
        return goRight(node.right);

    }
}
