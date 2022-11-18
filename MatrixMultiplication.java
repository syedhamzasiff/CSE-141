
package matrixmultiplication;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter row of matrix 1");
        int r1 = input.nextInt();
        System.out.println("enter column of matrix 1");
        int c1 = input.nextInt();
        System.out.println("enter row of matrix 2");
        int r2 = input.nextInt();
        System.out.println("enter column of matrix 2");
        int c2 = input.nextInt();
        
        if (c1 == r2) {
            System.out.println("enter matrix 1");
            int[][] m1 = input(r1, c1);
            System.out.println("enter matrix 2");
            int[][] m2 = input(r2, c2);
            int[][] m3 = matrixmulti(m1, m2, r1, c2);
            display(m3, r1, c2);
        }
        else if (c1 != r2){
            System.out.println("invalid input");
            System.exit(0);
        }
    }
    
    public static int[][] matrixmulti(int[][] m1, int[][] m2, int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < r; k++) {
                    m[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m;
    }
    public static void display(int[][] m3, int r1, int c2){
        System.out.println("The answer is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println("");
        }
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
}

