public class Skip_a_string {
    public static void main(String[] args) {
        System.out.println(skipString("Pineapple juice "));
    }
    static String skipString(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipString(str.substring(5));
        }
        else{
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}
