public class Skip_a_character_bodyFunction {
    public static void main(String[] args) {
        System.out.println(skip("naldfad"));
    }

    static String skip(String str){
        String ans = "";
        if(str.isEmpty()){
            return ans;
        }
        char ch = str.charAt(0);
        if(ch != 'a'){
            ans += ch;
        }
        String prev = skip(str.substring(1));
        ans += prev;
        return ans;
    }
}
