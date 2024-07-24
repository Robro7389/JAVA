import java.util.Arrays;

public class All_paths_print_paths {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        int[][] path = new int[maze.length][maze.length];
        allPath(maze,"",0,0,path,1);
        }


    static void allPath(boolean[][] maze,String str,int r,int c,int[][] path,int step){
        if (r == maze.length - 1 && c == maze.length - 1){
            path[r][c] = step;
            System.out.println(str);
            display(path);
            System.out.println();
            return;
        }

        if (maze[r][c]){
            return;
        }

        maze[r][c] = true;
        path[r][c] = step;

        if (r < maze.length - 1){
            allPath(maze,str + 'D',r + 1,c,path,step + 1);
        }
        if (c < maze.length - 1){
            allPath(maze,str + 'R',r,c + 1,path,step + 1);
        }
        if (r > 0){
            allPath(maze,str + 'U',r-1,c,path,step + 1);
        }
        if (c > 0){
            allPath(maze,str + 'L',r,c-1,path,step + 1);
        }

        maze[r][c] = false;
        path[r][c] = 0;
    }

    static void display(int[][] path){
        for(int[] arr : path){
            System.out.println(Arrays.toString(arr));
        }
    }
}
