public class Down_triangle {
    public static void main(String[] args) {
        print(4,0);
    }

    static void print(int r,int c){
        if (r == 0) {
            return;
        }
        if(c < r){
            System.out.print("* ");
            print(r,c+1);
        }
        else{
            System.out.println();
            print(r-1,0);
        }
    }
}
