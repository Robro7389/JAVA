package BinaryTrees;

public class AVLTree {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;
        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

    }
    private Node root;


    public AVLTree(){

    }

    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }




    public void insert(int value){
        root = insert(root,value);
    }

    private Node insert(Node node,int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(node.value > value){
            node.left = insert(node.left,value);
        }
        if(node.value < value){
            node.right = insert(node.right,value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if ((height(node.left) - height(node.right)) > 1){
            //Left side unbalanced
            if((height(node.left.left) - height(node.left.right)) > 0){
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
                //Right Left Case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;


        return c;
    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }

    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void generate(int[] nums){
        for (int a:
        nums){
            this.insert(a);
        }
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level){
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

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }


}
