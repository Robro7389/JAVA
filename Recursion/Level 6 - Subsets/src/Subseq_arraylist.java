import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subseq_arraylist {
    public static void main(String[] args) {
        System.out.println(subseq("","abc"));
    }
    static ArrayList<String> subseq(String sub,String str){
        if(str.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(sub);
            return ans;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subseq(sub+ch,str.substring(1));
        ArrayList<String> right = subseq(sub,str.substring(1));
        left.addAll(right);
        return left;
    }
}
