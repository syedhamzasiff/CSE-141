import java.util.InputMismatchException;
import java.util.Scanner;

public class taskThreeFinalLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        boolean correct = true;
        do{
            try{
                System.out.println("enter n");
                n = input.nextInt();
                correct = false;
            } catch(InputMismatchException e){
                System.out.println("invalid input");
                input.nextLine();
            }
        } while(correct);

        System.out.println(sequence(n));
    }
    public static String sequence(int n){


        if (n<1){
            return "no value";
        }
        if (n<2){
            return "1";
        }
        return sequence(n-1) + n ;
    }
}
