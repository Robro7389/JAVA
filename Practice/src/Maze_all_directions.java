public class Maze_all_directions {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        allPath(maze,"",0,0);
    }

    static void allPath(boolean[][] maze,String str,int r,int c){
        if (r == maze.length - 1 && c == maze.length - 1){
            System.out.println(str);
            return;
        }

        if(maze[r][c]){
            return;
        }

        maze[r][c] = true;

        if (r < maze.length - 1){
            allPath(maze, str + 'D', r + 1, c);
        }

        if (c < maze.length - 1){
            allPath(maze, str + 'R', r, c + 1);
        }

        if (r > 0){
            allPath(maze, str + 'U', r - 1, c);
        }

        if (c > 0){
            allPath(maze,str + 'L',r,c - 1);
        }
        maze[r][c] = false;
    }
}
