package AdvancedTrees;

public class LowestCommonAncestor {

    //LEETCODE 236
    //Lowest Common Ancestor of a Binary Tree
    //Companies: AMAZON

    public class TreeNode{
        TreeNode left;
        TreeNode right;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }

        TreeNode a = lowestCommonAncestor(root.left,p,q);
        TreeNode b = lowestCommonAncestor(root.right,p,q);

        if(a != null && b != null){
            return root;
        }

        if(a != null){
            return a;
        }
        else{
            return b;
        }

    }
}
