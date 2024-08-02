package AdvancedTrees;
import java.util.*;
public class AverageLevels {

    //LEETCODE 637
    //Average of Levels in Binary Tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            Double sum = 0.0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                sum += currNode.val;
                if (currNode.left != null){
                    queue.offer(currNode.left);
                }
                if (currNode.right != null){
                    queue.offer(currNode.right);
                }

            }
            sum /= levelSize;
            result.add(sum);
        }

        return result;
    }
}
