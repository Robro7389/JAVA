package BinaryTrees;

public class MySegmentTree {
    private static class Node{
        int value;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int start,int end,int value){
            this.start = start;
            this.end = end;
            this.value = value;
        }
    }

    public MySegmentTree(){

    }

    private Node root;

    public void insert(int[] nums){
        root = insert(nums,0,nums.length - 1,root);
    }

    private Node insert(int[] nums,int start,int end,Node node){
        if(start == end){
            node = new Node(start,end,nums[start]);
            return node;
        }

        node = new Node(start,end,0);
        int mid = (start + end)/2;
        node.left = insert(nums,start,mid,new Node(start,mid,0));
        node.right = insert(nums,mid+1,end,new Node(mid + 1,end,0));

        node.value = node.left.value + node.right.value;
        return node;
    }

    public void update(int[] nums,int index,int value){
        root = update(root,0,nums.length,index,value);
    }

    private Node update(Node node,int start,int end,int index,int value){
        if(start == index && index == end){
            node.value = value;
            return node;
        }

        if(index >= node.left.start && index <= node.left.end){
            node.left = update(node.left,node.left.start,node.left.end,index,value);
            node.value = node.left.value + node.right.value;
            return node;
        }

        if(index >= node.right.start && index <= node.right.end){
            node.right = update(node.right,node.right.start,node.right.end,index,value);
            node.value = node.left.value + node.right.value;
            return node;
        }

        return node;
    }

    public void display(int[] nums){
        display(root,"Root node:");
    }

    private void display(Node node,String details){
        if (node == null){
            return;
        }
        System.out.println(details + "(" + node.value + "," + node.start + "," + node.end + ")");
        display(node.left,"Left node of " + node.value);
        display(node.right,"Right node of " + node.value);
    }
}
