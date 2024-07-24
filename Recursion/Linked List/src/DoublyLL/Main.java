package DoublyLL;

import SinglyLL.LL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(40);
        list.insertLast(50);
        list.insert(1,15);
        list.insert(3,25);

        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
        System.out.println(list.delete(3));
        list.display();
        list.displayReverse();
    }
}
