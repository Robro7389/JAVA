package BinaryTrees.Practice;

public class AVLP {
    public class Node{
        int data;
        Node left;
        Node right;
        int height;
        public Node(int data){
            this.data = data;
        }
    }

    public int height() {
        return height(root);
    }
    private int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    private Node root;

    public AVLP(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void insert(int data){
        root = insert(root,data);
    }

    private Node insert(Node node,int data){
        if (node == null){
            node = new Node(data);
        }

        if (node.data > data){
            node.left = insert(node.left,data);
        }

        if (node.data < data){
            node.right = insert(node.right,data);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return rotate(node);
    }

    public Node rotate(Node node){
        if ((height(node.left) - height(node.right)) > 1){
            //Left side unbalanced
            if ((height(node.left.left) - height(node.left.right)) > 0){
                //Left Left case
                return rightRotate(node);
            }

            if ((height(node.left.left) - height(node.left.right)) < 0){
                //Left Right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if ((height(node.left) - height(node.right)) < -1){
            //Right side unbalanced
            if ((height(node.right.left) - height(node.right.right)) < 0){
                //Right Right case
                return leftRotate(node);
            }
            if ((height(node.right.left) - height(node.right.right)) > 0){
                //Right Left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left),height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;

    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if (node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
