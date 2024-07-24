import java.util.ArrayList;
import java.util.List;

public class Permutations_arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = permuteList("","abc");
        System.out.println(list);
    }

    static ArrayList<String> permuteList(String sub,String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(sub);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = str.charAt(0);
        for (int i = 0; i <= sub.length(); i++) {
            String f = sub.substring(0, i);
            String s = sub.substring(i);
            ans.addAll(permuteList(f+ch+s,str.substring(1)));
        }
        return ans;
    }
}
