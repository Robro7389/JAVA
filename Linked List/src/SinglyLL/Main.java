package SinglyLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insert(3,25);
        list.display();
        System.out.println(list.delete(6));
        list.display();
    }
}
