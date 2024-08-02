public class Skip_a_character {
    public static void main(String[] args) {
        System.out.println(skip("","baccad"));
    }

    static String skip(String sub,String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip(sub,str.substring(1));
        }
        else {
            return ch + skip(sub,str.substring(1));
        }
    }
}
