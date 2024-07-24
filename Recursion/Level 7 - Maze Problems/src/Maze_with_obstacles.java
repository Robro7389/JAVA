public class Maze_with_obstacles {
    public static void main(String[] args) {
        Boolean[][] matrix = {{true,true,true},
                              {true,false,true},
                              {true,true,true}};
        rockyPath("",matrix,0,0);
    }

    static void rockyPath(String str,Boolean[][] matrix,int r,int c){
        if(r == matrix.length-1 && c == matrix[0].length-1){
            System.out.println(str);
            return;
        }
        if (!matrix[r][c]){
            return;
        }
        if (r < matrix.length-1){
            rockyPath(str + 'D',matrix,r+1,c);
        }
        if (c < matrix.length-1){
            rockyPath(str + 'R',matrix,r,c+1);
        }

    }
}
