public class cClasses_and_objects {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.rno = 34;
//        s1.name = "Ronak";
//        s1.marks = 98.6f;

        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);
    }

}

class Student{
    int rno;
    String name = "ROnak Gour";
    float marks;
}