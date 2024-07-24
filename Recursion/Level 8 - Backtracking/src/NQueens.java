public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board,0));
    }

    static int nQueens(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int i = 0;i < board.length;i++){
            if (isSafe(board,row,i)){
                board[row][i] = true;
                count += nQueens(board,row+1);
                board[row][i] = false;
            }
        }

        return count;
    }
    static void display(boolean[][] board){
        for(boolean[] arr : board){
            for (boolean element : arr){
                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board,int row,int col){

        // Vertical Column
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // Diagonal Left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        //Diagonal Right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
}
