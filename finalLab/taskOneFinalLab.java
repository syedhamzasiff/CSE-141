import java.util.Scanner;

public class taskOneFinalLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter m");
        int m = 0;
        boolean correct1 = true;
        do {
            try{
                m = input.nextInt();
                correct1 = false;
            } catch (Exception e){
                System.out.println("wrong input");
                input.nextLine();
            }
        } while(correct1);

        System.out.println("enter p");
        int p = 0;
        boolean correct2 = true;
        do {
            try{
                p = input.nextInt();
                correct2 = false;
            } catch (Exception e){
                System.out.println("wrong input");
                input.nextLine();
            }
        } while(correct2);

        int[][] arr = inputMatrix(m);

        int[][] arrP = createP(arr, p);

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(arrP[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static int[][] inputMatrix(int m){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("value at row: %d and column: %d ", i, j);
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    public static int[][] createP (int[][] arr, int p){
        int[][] arrP = new int[p][p];

        for (int row = 0; row < p; row++) {
            for (int column = 0; column < p; column++) {
                int sum = 0;
                for (int i = row; i < p + row; i++) {
                    for (int j = column; j < p + column; j++) {
                        sum+= arr[i][j];
                    }

                }
                arrP[row][column] = sum;
            }
        }




        return arrP;
    }

}
