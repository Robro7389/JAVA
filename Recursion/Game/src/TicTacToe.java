import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';

            }
        }

        char player = 'X';
        boardRun(board,player);

    }

    public static void boardRun(char[][] board,char player){
        Scanner in = new Scanner(System.in);

        boolean gameover = false;
        while(!gameover){
            printBoard(board);
            System.out.println("Player " + player + " enter:");
            int row = in.nextInt();
            int col = in.nextInt();
            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameover = haveWon(board,player);
                if (gameover) {
                    System.out.println("Player " + player + " has won!");
                    printBoard(board);
                }
                else{
                    player =  (player == 'X') ? '0' : 'X';
                }
            }
            else{
                System.out.println("Invalid move,try again!");
            }
        }

    }

    public static boolean haveWon(char[][] board,char player){
        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if (board[2][0] == player && board[1][1] == player && board[0][2] == player){
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}