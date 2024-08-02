import java.util.ArrayList;

public class Permutations_Arraylist {
    public static void main(String[] args) {
        System.out.println(permute("","abc "));
    }

    static ArrayList<String> permute(String sub,String str){
        if (str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(sub);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = str.charAt(0);
        for (int i = 0; i <= sub.length(); i++) {
            String f = sub.substring(0,i);
            String s = sub.substring(i);
            ans.addAll(permute(f + ch + s,str.substring(1)));
        }

        return ans;
    }
}
