public class Constructor_overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Gour",34);
        s1.display();
        s2.display();
    }

    static class Student{
        int rno;
        String name;

        Student(){
            this.rno = 75;
            this.name = "Ronak";
        }

        Student(String name,int rno){
            this.rno = rno;
            this.name = name;
        }

        void display(){
            System.out.println(this.rno);
            System.out.println(this.name);
        }
    }
}
