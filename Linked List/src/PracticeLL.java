public class PracticeLL {

    private Node head;
    private int size;
    public PracticeLL(){
        size = 0;
    }

    public void addFirst(int val){
        if(head == null){
            Node node = new Node(val);
            head = node;
            size++;
            return;
        }
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int val){
        if (head == null){
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void add(int index,int val){
         if(head == null || index == 0){
             addFirst(val);
             return;
         }
         Node node = new Node(val);
         Node temp = head;
         while(index > 1){
             temp = temp.next;
             index--;
         }
         node.next = temp.next;
         temp.next = node;
         size++;
    }

    public Node find(int val){
        Node temp = head;
        while(temp.val != val || temp != null){
            temp = temp.next;
        }
        return temp;
    }

    public void insertRec(int index,int val){
        head = insertRec(index,val,head);
    }

    public Node insertRec(int index,int val,Node temp){
        if(index == 0){
            Node node = new Node(val);
            node.next = temp;
            return node;
        }
        temp.next = insertRec(index - 1,val,temp.next);
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
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
