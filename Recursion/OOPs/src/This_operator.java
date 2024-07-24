public class This_operator {
    public static void main(String[] args) {
        This t1 = new This();
        This t2 = new This();

        System.out.println(t1.rno);
        System.out.println(t1.name);
        System.out.println(t2.rno);
        System.out.println(t2.name);
    }
}

class This{
    int rno;
    String name;
    This(){
        this.rno = 45;
        this.name = "Ronak";
    }
}
