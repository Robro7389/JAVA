public class Non_static_inside_static {
    public static void main(String[] args) {
//        greeting1(); This will not work
        greeting2();


        Non_static_inside_static obj = new Non_static_inside_static();
        obj.greeting1();
    }
    void greeting1(){
        System.out.println("Greeting 1");
    }

    static void greeting2(){
        System.out.println("Greeting 2");
    }
}
