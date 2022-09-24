
package additionpattern;
import java.util.*;
public class AdditionPattern {

    public static void main(String[] args) {
        System.out.println("Enter your input: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum; 
        
        for (int r = 1; r <=num; r++) {
            sum=0;
            for (int c = 1; c<=r; c++) {
                
                System.out.print(c + " ");
                if(c<r)
                    System.out.print("+ ");
                else
                    System.out.print("= ");
            sum = sum + c;  
                        
            }
            System.out.print(sum);
            System.out.println("");
        }
                
    }
    
}
