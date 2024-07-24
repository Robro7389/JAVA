import java.util.ArrayList;

public class Counting_paths {
    public static void main(String[] args) {
        System.out.println(pathCount("",3,3));
    }

    static ArrayList<String> pathCount(String str,int row,int col){
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row > 1){
            ans.addAll(pathCount(str + 'D',row-1,col));
        }
        if(col > 1){
            ans.addAll(pathCount(str + 'R',row,col-1));
        }
        return ans;
    }
}
