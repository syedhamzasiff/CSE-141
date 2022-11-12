import java.util.Scanner;

public class fibonacciSeriesRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int count= input.nextInt();
        System.out.print("0 1");
        fibonacci(count-2);
    }
    static int num1 = 0, num2 = 1, num3 = 0;

    static void fibonacci(int count){

        if(count>0){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
            fibonacci(count-1);
        }
    }

}
