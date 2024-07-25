package AdvancedTrees;

import com.sun.source.tree.Tree;

public class KthSmallestNumber {

    //LEETCODE 230
    //Kth smallest element in BST
    //Companies: META,AMAZON,GOOGLE

    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }

    int count = 0;
    public int kthsmallestnumber(TreeNode root,int k){
        return inOrder(root,k).val;
    }

    private TreeNode inOrder(TreeNode node, int k) {
        if (node == null){
            return null;
        }

        TreeNode left = inOrder(node.left,k);

        if (left != null){
            return left;
        }

        count++;
        if (count == k){
            return node;
        }

        return inOrder(node.right,k);
    }


}
