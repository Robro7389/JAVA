public class Copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Ronak",43);
        System.out.println(s1.rno);
        System.out.println(s1.name);


        Student s2 = new Student(s1);
        System.out.println(s2.rno);
        System.out.println(s2.name);
    }

    static class Student{
        int rno;
        String name;

        Student(String name,int rno){
            System.out.println("Parameterised Constructor called!!");
            this.rno = rno;
            this.name = name;
        }

        Student(Student obj2){
            System.out.println("Copy Constructor called!!");
            this.rno = obj2.rno;
            this.name = obj2.name;
        }
    }
}
