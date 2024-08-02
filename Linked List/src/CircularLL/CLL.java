package CircularLL;

public class CLL {

    private Node head;
    private Node tail;
    private int size;
    public CLL(){
        this.size = 0;
    }

    //INSERTION AT FIRST PLACE

    public void insertFirst(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            tail.next = head;
        }
        else{
            node.next = head;
            tail.next = node;
            head = node;
        }
        size++;
    }

    //INSERTION IN MIDDLE

    public void insert(int pos,int val){
        if(pos == 0){
            insertFirst(val);
            return;
        }
        if (pos == size - 1){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        int i = 0;
        while(i < pos - 1){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    //INSERTION AT LAST PLACE

    public void insertLast(int val){
        if (head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    // DISPLAY

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    private class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.next = next;
            this.val = val;
        }
    }
}
