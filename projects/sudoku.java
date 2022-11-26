import java.util.*;
public class sudoku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] table = table();
        int[][] copyTable = hardcoded();
        int correct = 0;
        int moves = 0;
        while (correct < 54) {
            printTable(table);
            int num;
            int r;
            int c;
            System.out.println("what is your number");
            num = input.nextInt();
            System.out.println("enter row");
            r = input.nextInt();
            System.out.println("enter column");
            c = input.nextInt();
            if (rowChecker(table, r - 1, num) && columnChecker(table, c - 1, num) &&            //new value check
                    grid3checker(table, r, c, num) &&table[r - 1][c - 1] == 0) {
                        table[r - 1][c - 1] = num;
                        correct++;
                        moves++;
            }
            else if(copyTable[r-1][c-1] == 0)                                                         //hard coded value check
                System.out.println("question value, select a different position");
            else if (copyTable[r-1][c-1] == 1 && table[r-1][c-1] != 0){                               //rewrite check
                System.out.println("Value already given, do you wish to rewrite?");
                System.out.println("press '1' to rewrite, press '0' to select a different position");
                int rewrite = input.nextInt();
                if (rewrite == 1 ){
                    table[r - 1][c - 1] = num;
                    moves++;
                } else if (rewrite == 0 ) {
                    System.out.println("enter row");
                    int tempR = input.nextInt();
                    System.out.println("enter column");
                    int tempC = input.nextInt();
                    table[tempR -1][tempC-1] = num;
                    moves++;
                }
            }
        }
       endGame(moves);
    }

    public static boolean rowChecker(int[][] table, int r, int num) {
        for (int i = 0; i < 9; i++) {
            if (table[r][i] == num)
                return false;
        }
        return true;
    }
    public static boolean columnChecker(int[][] table, int c, int num) {
        for (int i = 0; i < 9; i++) {
            if (table[i][c] == num)
                return false;
        }
        return true;
    }
    public static boolean grid3checker(int[][] table, int r, int c, int num) {
        int row = ((r-1) / 3)*3;
        int column = ((c-1) / 3)*3;
        for (int i = 0; i < 3; i++) // box
            for (int j = 0; j < 3; j++)
                if (num == table[row+i][column+j])
                    return false;

        return true;
    }
    public static void printTable(int[][] table) {
        System.out.println();
        for (int i = 0; i < 9; i++) {               //print the table for user
            System.out.print(" | ");
            for (int j = 0; j < 9; j++) {
                if (table[i][j] == 0)
                    System.out.print(". ");
                else System.out.print(table[i][j] + " ");
            }
            System.out.println("|");
        }
    }
    public static int[][] table() {
        return new int[][]{                          //the sudoku table
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};
    }
    public static void endGame(int moves) {
        System.out.println("Game finished");
        System.out.printf("you finished the game in %d turns", moves);
        System.out.println();
    }
    public static int[][] hardcoded(){
        return new int[][] {
                {0, 0, 1, 1, 0, 1 ,1, 1, 1},        //0= hardcoded values
                {0, 1, 1, 0, 0, 0, 1, 1, 1},        //1= user input
                {1, 0, 0, 1, 1, 1, 1, 0, 1},
                {0, 1, 1, 1, 0, 1, 1, 1, 0},
                {0, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 1, 1, 0},
                {1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 1, 0, 1, 1, 0, 0}};
        }
}







