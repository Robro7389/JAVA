package AdvancedTrees;
import java.util.Arrays;

public class BST_with_preorder_and_inorder {

    //LEETCODE 105
    //Construct BST from preorder and inorder
    //Companies: Amazon

    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val){
            this.val = val;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }

        TreeNode node = new TreeNode(preorder[0]);
        int index = 0;
        for(int i = 0;i < inorder.length;i++){
            if(inorder[i] == node.val){
                index = i;
                break;
            }
        }

        node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;
    }
}
