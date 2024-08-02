public class Skip_a_string {
    public static void main(String[] args) {
        System.out.println(skip("pineapple juice"));
    }

    static String skip(String str){
        if (str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }
        else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }
}
