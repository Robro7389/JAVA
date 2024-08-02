package BinaryTrees.Practice;

import java.util.Scanner;

public class BinaryTreeP {
    public class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }

    }

    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    private Node root;

    public BinaryTreeP(){

    }

    public void generate(Scanner in){
        System.out.print("Enter the root node:");
        int value = in.nextInt();
        root = new Node(value);
        generate(root,in);
    }

    private void generate(Node node,Scanner in){
        //Left insertion
        System.out.println("Do you want to at insert at left of " + node.value + "?");
        boolean left = in.nextBoolean();
        if (left){
            System.out.print("Enter the value");
            int value = in.nextInt();
            node.left = new Node(value);
            generate(node.left,in);
        }

        //Right insertion
        System.out.println("Do you want to at insert at right of " + node.value + "?");
        boolean right = in.nextBoolean();
        if (left){
            System.out.print("Enter the value: ");
            int value = in.nextInt();
            node.right = new Node(value);
            generate(node.right,in);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){
        if (node.left != null){
            display(node.left,indent + "\t");
        }
        System.out.println(indent + node.value);

        if (node.right != null){
            display(node.right,indent + "\t");
        }
    }



}
