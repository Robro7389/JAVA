public class Maze_down_right {
    public static void main(String[] args) {
        path("",3,3);
    }

    static void path(String str,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(str);
            return;
        }

        if (r > 1){
            path(str + 'D', r - 1, c);
        }

        if (c > 1){
            path(str + 'R', r, c - 1);
        }
    }
}
