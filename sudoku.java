import java.util.*;
public class sudoku {
    public static void main(String[] args) {
        int[][] table = {                           //the sudoku table
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};

        int correct = 0;
        int moves = 0;
        while (correct < 55) {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 9; i++) {               //print the table for user
                for (int j = 0; j < 9; j++) {
                    if (table[i][j] == 0)
                        System.out.print(". ");
                    else System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }
            boolean flag1 = true;
            boolean flag2 = true;
            int num;
            int r;
            int c;
            System.out.println("what is your number");
            num = input.nextInt();
            System.out.println("enter row");
            r = input.nextInt();
            System.out.println("enter column");
            c = input.nextInt();
            if (rowchecker(table, r - 1, num) && columnchecker(table, c - 1, num) &&
                    grid3checker(table, r, c, num) &&table[r - 1][c - 1] == 0) {
                        table[r - 1][c - 1] = num;
                        correct++;
            } else System.out.println("wrong choice, play again");
            moves++;
        }
        System.out.println("Game finished");
        System.out.printf("you finished the game in %d turns", moves);
        System.out.println();
    }

    public static boolean rowchecker(int[][] table, int r, int num) {
        for (int i = 0; i < 9; i++) {
            if (table[r][i] == num)
                return false;
        }
        return true;
    }

    public static boolean columnchecker(int[][] table, int c, int num) {
        for (int i = 0; i < 9; i++) {
            if (table[i][c] == num)
                return false;
        }
        return true;
    }

    public static boolean grid3checker(int[][] table, int row, int column, int num) {
        int r = row / 3;
        int c = column / 3;
        if (r == 0) {
            if (c == 0) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (table[r][i] == num)
                            return false;
                    }
                }
            } else if (c == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (j > 2 && table[r][i] == num)
                            return false;
                    }
                }

            } else if (c == 2) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (j > 5 && table[r][i] == num)
                            return false;
                    }
                }
            }
        }
        else if (r == 1) {
            if (c == 0) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i>2 && table[r][i] == num)
                            return false;
                    }
                }
            } else if (c == 1) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (i>2 && j>2 && table[r][i] == num)
                            return false;
                    }
                }

            } else if (c == 2) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (i>2 && j>5 && table[r][i] == num)
                            return false;
                    }
                }
            }
        }

        if (r == 2) {
            if (c == 0) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i>5 && table[r][i] == num)
                            return false;
                    }
                }
            } else if (c == 1) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (i>5 && j>2 && table[r][i] == num)
                            return false;
                    }
                }

            } else if (c == 2) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (i>5 && j>5 && table[r][i] == num)
                            return false;
                    }
                }
            }
        }
        return true;
    }
}








/*
{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};
 */