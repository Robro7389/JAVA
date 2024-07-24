package BinaryTrees;

public class SegmentTree {
    private static class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int start,int end){
            this.start = start;
            this.end = end;
        }

    }

    private Node root;

    public SegmentTree(int[] arr){
        root = constructTree(arr,0,arr.length - 1);
    }

    private Node constructTree(int[] arr,int start,int end){
        if (start == end){
            //Leaf Node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);

        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display(){
        display(root,"Root node:");
    }

    private void display(Node node, String details){
        if (node == null){
            return;
        }
        System.out.println(details + "(" + node.data + "," + node.start + "," + node.end + ")");
        display(node.left,"Left node of " + node.data);
        display(node.right,"Right node of " + node.data);
    }

    public int query(int qStart,int qEnd){
        return query(root,qStart,qEnd);
    }

    private int query(Node node,int qStart,int qEnd){
        if (node.start >= qStart && node.end <= qEnd){
            //Node lies completely inside the query
            return node.data;
        }
        else if (node.start > qEnd || node.end < qStart){
            return 0;
        }
        else{
            return query(node.left,qStart,qEnd) + query(node.right,qStart,qEnd);
        }
    }

    public void update(int index,int value){
        root.data = update(root,index,value);
    }

    private int update(Node node,int index,int value){
        if (index >= node.start && index <= node.end){
            if (index == node.start && index == node.end){
                node.data = value;
                return node.data;
            }
            else{
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
