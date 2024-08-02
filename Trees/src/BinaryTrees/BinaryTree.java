package BinaryTrees;
import java.util.Scanner;
public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    private Node root;
    public void generate(Scanner in){
        System.out.println("Enter the root node:");
        int value = in.nextInt();
        root = new Node(value);
        generate(in,root);
    }

    private void generate(Scanner in,Node node){
        System.out.println("Do you want to enter the LEFT of " + node.value);
        boolean left = in.nextBoolean();
        if (left) {
            System.out.println("Enter the value:");
            int value = in.nextInt();
            node.left = new Node(value);
            generate(in,node.left);
        }

        System.out.println("Do you want to enter the RIGHT of " + node.value);
        boolean right = in.nextBoolean();
        if (right) {
            System.out.println("Enter the value:");
            int value = in.nextInt();
            node.right = new Node(value);
            generate(in,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node,int level){
        if (node == null){
            return;
        }

        prettyDisplay(node.right,level + 1);

        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        }
        else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level + 1);
    }
}
