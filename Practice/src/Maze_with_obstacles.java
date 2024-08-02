public class Maze_with_obstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        path(maze,"",0,0);
    }

    static void path(boolean[][] maze,String str,int r,int c){
        if (r == maze.length - 1 && c == maze.length - 1){
            System.out.println(str);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if (r < maze.length - 1){
            path(maze,str + 'D',r + 1,c);
        }
        if (c < maze.length - 1){
            path(maze,str + 'R',r,c + 1);
        }
    }
}
