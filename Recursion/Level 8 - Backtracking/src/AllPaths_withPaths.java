import java.util.Arrays;

public class AllPaths_withPaths {
    public static void main(String[] args) {

        Boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        allPath(maze,"",0,0,path,1);
    }

    static void allPath(Boolean[][] maze,String str,int r,int c,int[][] path,int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(str);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allPath(maze, str + 'D', r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1){
            allPath(maze, str + 'R', r, c + 1, path, step + 1);
        }

        if (r > 0){
            allPath(maze, str + 'U', r - 1, c, path, step + 1);
        }

        if (c > 0){
            allPath(maze, str + 'L', r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
