package BinaryTrees.Practice;

public class STP {
    public class Node{
        int data;
        Node left;
        Node right;
        int start;
        int end;
        public Node(int start,int end){
            this.start = start;
            this.end = end;
        }

    }

    private Node root;

    public STP(int[] arr){
        root = generate(arr,0,arr.length-1);
    }

    public Node generate(int[] arr,int start,int end){
        if (start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);
        int mid = (start + end) / 2;

        node.left = generate(arr,start,mid);
        node.right = generate(arr,mid + 1,end);

        node.data = node.left.data + node.right.data;
        return node;

    }

    public void display(){
        display(root,"Root Node:");
    }

    private void display(Node node,String details){
        if (node == null){
            return;
        }

        System.out.println(details + "(" + node.data + "," + node.start + "," + node.end + ")");
        display(node.left,"Left node of " + node.data + ":");
        display(node.right,"Right node of " + node.data + ":");
    }

    public int query(int qStart,int qEnd){
        return query(root,qStart,qEnd);
    }

    private int query(Node node,int qStart,int qEnd){
        if (node.start >= qStart && node.end <= qEnd){
            return node.data;
        }

        if (node.start > qEnd || node.end < qStart){
            return 0;
        }

        return query(node.left,qStart,qEnd) + query(node.right,qStart,qEnd);
    }

    public void update(int index,int data){
        root.data = update(root,index,data);
    }

    private int update(Node node,int index,int data){
        if (index >= node.start && index <= node.end){
            if (index == node.start && index == node.end){
                node.data = data;
                return node.data;
            }
            int leftAns = update(node.left,index,data);
            int rightAns = update(node.right,index,data);

            node.data = leftAns + rightAns;
            return node.data;
        }
        return node.data;
    }
}
