public class Population {
    int rno;
    String name;
    static int pop;

    public Population(int rno,String name){
        this.rno = rno;
        this.name = name;
        pop += 1;
    }
}

// The instances of this class are being created in Human.java file.
