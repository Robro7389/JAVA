public class Functions_in_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.display();
        s2.display();
    }

    static class Student{
        int rno;
        String name;

        Student(){
            this.rno = 56;
            this.name = "Ronak Gour";
        }

        void display(){
            System.out.println("My name is " + name);
            System.out.println("My roll no is " + rno);
        }
    }
}
