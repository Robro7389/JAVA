public class Memory_allocation_of_same_objects {
    public static void main(String[] args) {
        Student s1 = new Student("Ronak",86);
        Student s2 = s1;

        s2.name = "fnks";

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s2.name);
        System.out.println(s2.rno);
    }

    static class Student{
        int rno;
        String name;
        Student(String name,int rno){
            this.rno = rno;
            this.name = name;
        }
    }
}
