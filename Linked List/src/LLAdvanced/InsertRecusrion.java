package LLAdvanced;

import SinglyLL.LL;

public class InsertRecusrion {
    private Node head;
    private Node tail;
    private int size;
    public InsertRecusrion(){
        this.size = 0;
    }

    public void insertRec(int index,int val){
        head = insertRec(index,val,head);
    }
    public Node insertRec(int index,int val,Node temp){
        if (head == null){
            Node node = new Node(val);
            head = node;
            size++;
            return node;
        }
        if (index == 0){
            Node node = new Node(val,temp);
            size++;
            return node;
        }
        temp.next = insertRec(index - 1,val,temp.next);
        return temp;
    }

    // Create a cycle in linkedlist

    public void connect(int index){
        connect(index,head);
    }

    public void connect(int index,Node node){
        if(index == 0){
            Node temp = node;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            return;
        }
        connect(index - 1,node.next);
    }

    public boolean hasCycle(){
        return hasCycle(head);
    }

    public boolean hasCycle(Node node){
        Node fast = node;
        Node slow = node;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(){
        return lengthCycle(head);
    }

    public int lengthCycle(Node node){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                int count = 0;
                do{
                    temp = temp.next;
                    count++;
                }while(temp != slow);
                return count;
            }
        }
        return 0;
    }

    public void sortList(){
        head = sortList(head);
    }

    public Node sortList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left,right);
    }

    public Node merge(Node list1,Node list2){
        Node dummyhead = new Node();
        Node temp = dummyhead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while (list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return dummyhead.next;
    }

    public Node getMid(Node head){
        Node f = head;
        Node s = head;
        Node temp = head;
        while(f != null && f.next != null){
            temp = s;
            s = s.next;
            f = f.next.next;
        }
        temp.next = null;
        return s;
    }



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node get(int index){
        return get(index,head);
    }
    public Node get(int index,Node temp){
        if(index == 0){
            return temp;
        }
        return get(index - 1,temp.next);
    }

    public int size(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void bubbleSort(){
        bubbleSort(size - 1,0);
    }

    public void bubbleSort(int row,int col){
        if(row == 0){
            return;
        }
        if(col < row){
            Node f = get(col);
            Node s = get(col + 1);

            if(f.val > s.val){
                if(f == head){
                    head = s;
                    f.next = s.next;
                    s.next = f;
                }
                else{
                    Node prev = get(col - 1);
                    prev.next = s;
                    f.next = s.next;
                    s.next = f;
                }
            }
            bubbleSort(row,col + 1);
        }
        else{
            bubbleSort(row - 1,0);
        }
    }

    public void reverse(){
        reverse(head,head.next,head.next.next);
    }
    public void reverse(Node first,Node second,Node third){
        if (first == head){
            first.next = null;
        }
        if(third == null){
            second.next = first;
            head = second;
            return;
        }
        second.next = first;
        reverse(second,third,third.next);
    }

    public class Node {
        private int val;
        private Node next;

        public Node(){
            this.next = null;
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val,Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
