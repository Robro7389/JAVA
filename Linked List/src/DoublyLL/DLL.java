package DoublyLL;

public class DLL {

    private Node head;
    private Node tail;
    private int size;
    public DLL(){
       this.size = 0;
    }

    //INSERTION AT FIRST PLACE
    public void insertFirst(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            node.prev = null;
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
        Node node = new Node(val);
        Node temp = head;
        int i = 0;
        while(i < pos - 1){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
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
        node.prev = tail;
        tail = node;
        size++;
    }

    // DELETION AT FIRST PLACE

    public int deleteFirst(){
        int rem = head.val;
        if (head == tail){
            head = null;
            tail = null;
            size--;
            return rem;
        }
        head = head.next;
        head.prev = null;
        size--;
        return rem;
    }

    //DELETION IN MIDDLE

    public int delete(int pos){
        if (pos == 0){
            return deleteFirst();
        }
        if (pos == size - 1){
           return deleteLast();
        }
        Node temp = head;
        int i = 0;
        while(i < pos){
            temp = temp.next;
            i++;
        }
        int rem = temp.val;
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        size--;
        return rem;
    }

    // DELETION AT LAST PLACE
    public int deleteLast(){
        int rem = tail.val;
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return rem;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return rem;

    }

    //DISPLAY

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // PRINT BACKWARDS

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
