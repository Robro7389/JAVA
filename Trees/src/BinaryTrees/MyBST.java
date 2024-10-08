package BinaryTrees;

public class MyBST {
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

    public int height(){
        return getHeight(root);
    }
    public int getHeight(Node node){
        if (node == null){
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

        if(value > node.value){
            node.right = insert(node.right,value);
        }

        if (value < node.value){
            node.left = insert(node.left,value);
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for (int i = 0;i < nums.length;i++){
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums,int start,int end){
        if(start >= end){
            return;
        }

        int mid = (start + end)/2;
        insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid + 1,end);
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root,"Root node :");
    }

    private void display(Node node,String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);
        display(node.left,"Left of " + node.value + ":");
        display(node.right,"Right of " + node.value + ":");
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }



}
