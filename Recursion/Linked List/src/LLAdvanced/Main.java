package LLAdvanced;

public class Main {
    public static void main(String[] args) {
        InsertRecusrion list = new InsertRecusrion();
        list.insertRec(0,10);
        list.insertRec(1,20);
        list.insertRec(2,30);
        list.insertRec(3,40);
        list.insertRec(3,35);
        list.display();
    }
}
