
package binaryrepresentation;
import java.util.*;

public class BinaryRepresentation {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        int rem;
        int bin = 0;
        
        while(num!=0) {
            rem = num % 2;
            bin = (bin*10)+rem;
            num = num / 2;
        }
        System.out.println("The binary representation is: " + bin);
       
    }
    
}
