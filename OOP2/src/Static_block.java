public class Static_block {

    static int a = 2;
    static int b;

    static {
        System.out.println("Static block running");
        b = a * 5;
    }

    public static void main(String[] args) {
//        Static_block obj = new Static_block();

    }
}
