public class Constructor_default_and_parameterised {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
//        Constructor c2 = new Constructor(46,"Ronak",98.7f);// here,constructor initialization required otherwise it will pass the error.

    }
}

class Constructor{
    int rno;
    String name;
    float marks;
}