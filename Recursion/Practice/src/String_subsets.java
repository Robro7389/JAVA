public class String_subsets {
    public static void main(String[] args) {
        subseq("","abc");
    }
    static void subseq(String sub,String str){
        if(str.isEmpty()){
            System.out.println(sub);
            return;
        }
        char ch = str.charAt(0);
        subseq(sub + ch, str.substring(1));
        subseq(sub, str.substring(1));
    }
}
