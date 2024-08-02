public class Calling_constructor_from_ahother_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.rno);
        System.out.println(s1.name);
//
        Student s2 = new Student("Kunal", 74);
        System.out.println(s2.rno);
        System.out.println(s2.name);

    }

    static class Student{
        int rno;
        String name;

        Student(){
            this ("Ronak",32);
//            System.out.println("default constructor called!");
        }

        Student(String name,int rno){
            System.out.println("Parameterised constructor called!!");
            this.name = name;
            this.rno = rno;
        }

    }
}
