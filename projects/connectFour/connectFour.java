
import java.util.*;
public class connectFour {
    public static void main(String[] args) throws inputBetweenZeroSevenException {
        Scanner input = new Scanner(System.in);
        char[][] board = newBoard();            //creates a new board

        introduction();
        char user1 = 'R';
        char user2 = 'B';
        boolean win = false;                    //this variable checks if the person wins
        boolean correctInput = true;

        int turn = 0;
        while (!win && turn <= 41) {             //the actual game
            char user;
            if (turn % 2 == 0)                  //if even then user 1, else user 2
                user = user1;
            else user = user2;
            do {
                boolean between1n7;              //if the chosen column is not full
                int column = -1;
                do {
                    printBoard(board);
                    if (turn % 2 == 0)
                        System.out.print("user 1's (R) turn, column: ");
                    else System.out.print("user 2's (B) turn, column: ");

                    try {
                        column = input.nextInt();
                        validateInputChecker(column);
                        correctInput = false;
                    } catch (InputMismatchException ex) {
                        System.out.print("incorrect input, try again: ");
                        input.nextLine();
                    }
                    between1n7 = validityChecker(column, board);


                } while (!between1n7);

                for (int i = 5; i >= 0; i--) {
                    if (board[i][column - 1] == ' ') {
                        board[i][column - 1] = user;
                        break;
                    }
                }
                turn++;
                if (rowCheck(user, board) || columnCheck(user, board) || diagonalCheck(user, board)) {
                    finalMessage(turn);
                    System.exit(0);
                }
            } while (correctInput);
        }
    }
    public static void introduction(){
        System.out.println("""
                Connect-Four is a tic-tac-toe-like two-player game in which players alternately place pieces on a vertical board 7 columns across and 6 rows high. 
                Each player uses pieces of a particular color (commonly black and red, or sometimes yellow and red), and the object is to be the first to obtain four pieces in a horizontal, vertical, or diagonal line. 
                Because the board is vertical, pieces inserted in a given column always drop to the lowest unoccupied row of that column. 
                As soon as a column contains 6 pieces, it is full and no other piece can be placed in the column.

                Both players begin with 21 identical pieces, and the first player to achieve a line of four connected pieces wins the game. 
                If all 42 men are played and no player has places four pieces in a row, the game is drawn.""");
        System.out.println("user 1, you're R and user 2, you're B");
        System.out.println("PLAY!");
    }
    public static char[][] newBoard(){
        char[][] board = new char[6][7];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                board[i][j] = ' ';
            }
        }
        return board;
    }
    public static void printBoard(char[][] board){
        System.out.println();
        System.out.println("! 1   2   3   4   5   6   7 !");
        for (int i = 0; i < 6; i++){
            System.out.print("| ");
            for (int j = 0; j < 7; j++){
                System.out.print(board[i][j] + " ");
                System.out.print("| ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean validityChecker(int column, char[][] board){
        if (column < 1 || column > 7){
            return false;
        }
        return board[0][column-1] == ' ';
    }
    public static boolean rowCheck(char user, char[][] board) {
        for(int i = 0; i<6; i++){
            for (int j = 0; j < 4; j++){
                if (board[i][j] == user   &&
                        board[i][j+1] == user &&
                        board[i][j+2] == user &&
                        board[i][j+3] == user){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean columnCheck(char user, char[][] board) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 7; j++){
                if (board[i][j] == user  && board[i+1][j] == user && board[i+2][j] == user && board[i+3][j] == user) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean diagonalCheck(char user, char[][] board) {
        for(int i = 3; i < 6; i++){
            for(int j = 0; j < 4; j++){
                if (board[i][j] == user && board[i-1][j+1] == user && board[i-2][j+2] == user && board[i-3][j+3] == user) {
                    return true;
                }
            }
        }
        for(int i = 0; i < 6 - 3; i++){
            for(int j = 0; j < 7 - 3; j++){
                if (board[i][j] == user  && board[i+1][j+1] == user && board[i+2][j+2] == user && board[i+3][j+3] == user) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void finalMessage(int turn){
        if (turn % 2 != 0)
            System.out.println("user 1, the R one, yes you won");
        else System.out.println("B, you won, good job!");
    }
    public static void validateInputChecker (int column) throws inputBetweenZeroSevenException {
        if (column<1 && column >7){
            System.out.println("incorrect input, try again: ");
            throw new inputBetweenZeroSevenException();
        }
    }
}
