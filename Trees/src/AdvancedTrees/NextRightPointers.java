package AdvancedTrees;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointers {

    //LEETCODE 116
    //Populating Next Right Pointers in Each Node
    public class Node{
        Node left;
        Node right;
        Node next;

    }

    public Node connect(Node root) {
        if (root == null){
            return null;
        }

        Node currNode = root;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                currNode = queue.poll();
                if (currNode.left != null){
                    queue.add(currNode.left);
                }
                if (currNode.right != null){
                    queue.add(currNode.right);
                }
                currNode.next = queue.peek();
            }
            currNode.next = null;
        }
        return root;
    }
}

