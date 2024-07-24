package SinglyLL;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    //INSERTION AT FIRST PLACE
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }

        size += 1;
    }

    //INSERTION IN MIDDLE

    public void insert(int pos,int val){
        Node node = new Node(val);
        if (pos == 1){
            insertFirst(val);
        }
        else {
            Node temp = head;
            int i = 1;
            while(i < pos - 1){
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }


    // INSERTION AT LAST PLACE

    public void insertLast(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        node.next = null;

        size += 1;
    }


    //DELETION AT FIRST PLACE

    public int deleteFirst(){
        int rem = head.val;
        if (head == tail){
            head = null;
            tail = null;
        }
        else {
            head = head.next;
        }
        return rem;
    }

    //DELETION IN MIDDLE

    public int delete(int pos){
        if (head == tail){
            return deleteFirst();
        }
        if (pos == 1){
            return deleteFirst();
        }
        Node temp = head;
        int i = 1;
        while(i < pos - 1){
            temp = temp.next;
            i++;
        }
        int rem = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return rem;
    }

    //DELETION AT LAST PLACE

    public int deleteLast(){
        int rem = tail.val;
        if (head == tail){
            head = null;
            tail = null;
        }
        else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
        size--;
        return rem;
    }

    // FIND NODE

    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if (temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //DISPLAY

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
//        System.out.println(tail.val);
    }

    public class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
