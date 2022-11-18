import java.util.*;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter row and column of matrix ");
        int r = input.nextInt();
        int c = r;

        int[][] m = input(r, c);
        transpose(m, r, c);
        display(m, r ,c);
    }
    public static int[][] input(int r, int c) {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("input row %d, column %d: ", i+1, j+1);
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    public static void display(int[][] m, int r, int c){
        System.out.println("The answer is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] transpose (int [][] m, int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int temp = m[i][j];
                m[j][i] = m[i][j];
                m[j][i] = temp;
            }
        }
        return m;
    }
}
