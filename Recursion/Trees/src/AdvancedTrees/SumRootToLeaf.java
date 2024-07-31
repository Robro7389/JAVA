package AdvancedTrees;

public class SumRootToLeaf {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }

    //LEETCODE 129
    //Sum Root to Leaf Numbers

    public int sumNumbers(TreeNode root) {
        return pathSum(root,0);
    }

    public int pathSum(TreeNode node,int sum){
        if(node == null){
            return 0;
        }

        sum = sum * 10 + node.val;

        if(node.left == null && node.right == null){
            return sum;
        }

        return pathSum(node.left,sum) + pathSum(node.right,sum);
    }
}
