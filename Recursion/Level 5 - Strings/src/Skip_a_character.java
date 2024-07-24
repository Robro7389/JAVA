public class Skip_a_character {
    public static void main(String[] args) {
        String str = "baccad";
        String ans = "";
        System.out.println(skip(str,ans,0));
    }
    static String skip(String str,String ans,int i){
        if(i == str.length()){
            return ans;
        }
        if(str.charAt(i) != 'a' && str.charAt(i) != 'A'){
            ans += str.charAt(i);
        }
        return skip(str,ans,i+1);
    }
}
