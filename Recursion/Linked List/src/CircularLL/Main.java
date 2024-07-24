package CircularLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(40);
        list.insert(2,25);
        list.display();
    }
}
