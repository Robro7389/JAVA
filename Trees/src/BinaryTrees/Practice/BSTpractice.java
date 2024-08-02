package BinaryTrees.Practice;

public class BSTpractice {
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

    public BSTpractice(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void insert(int value){
        root = insert(root,value);
    }

    private Node insert(Node node,int value){
        if (node == null){
            node = new Node(value);
        }

        if (node.value > value){
            node.left = insert(node.left,value);
        }

        if (node.value < value){
            node.right = insert(node.right,value);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node,String details){
        if (node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,details + "\t");
        display(node.right,details + "\t");
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

      public void preOrder(){
        preOrder(root);
          System.out.println();
    }

    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

      public void postOrder(){
        postOrder(root);
          System.out.println();
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }



}
