import javax.swing.text.StyledEditorKit;

public class allPaths {
    public static void main(String[] args) {
        Boolean[][] maze = new Boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath(maze, "", 0, 0);
    }

    static void allPath(Boolean[][] maze,String str,int r,int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(str);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length - 1){
            allPath(maze, str + 'D', r + 1, c);
        }

        if (c < maze[0].length - 1){
            allPath(maze, str + 'R', r, c + 1);
        }

        if(r > 0){
            allPath(maze, str + 'U', r - 1, c);
        }

        if (c > 0){
            allPath(maze, str + 'L', r, c - 1);
        }

        maze[r][c] = true;
    }
}
