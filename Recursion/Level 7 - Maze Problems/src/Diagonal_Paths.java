public class Diagonal_Paths {
    public static void main(String[] args) {
        DiagPaths("",3,3);
    }

    static void DiagPaths(String str,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(str);
            return;
        }

        if(r > 1 && c > 1){
            DiagPaths(str + "Diag",r-1,c-1);
        }
        if(r > 1){
            DiagPaths(str + 'D',r - 1,c);
        }
        if(c > 1){
            DiagPaths(str + 'R',r,c-1);
        }
    }
}
