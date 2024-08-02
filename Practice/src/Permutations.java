public class Permutations {
    public static void main(String[] args) {
        permute("","abc");
    }

    static void permute(String sub,String str){
        if(str.isEmpty()){
            System.out.println(sub);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0;i <= sub.length();i++){
            String f  = sub.substring(0,i);
            String s = sub.substring(i);
            permute(f + ch + s,str.substring(1));
        }
    }
}
