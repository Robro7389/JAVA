package LLAdvanced;

public class LengthCycle {
    public static void main(String[] args) {
        InsertRecusrion list = new InsertRecusrion();
        list.insertRec(0,3);
        list.insertRec(0,1);

//        list.connect(5);
        list.display();
        list.bubbleSort();
        list.display();
        list.reverse();
        list.display();
    }
}
