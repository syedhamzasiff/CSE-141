
package isbn;
import java.util.*;

public class ISBN {

    public static void main(String[] args) {
                Scanner input = new Scanner (System.in);
                
                //9 digit number input
                System.out.println("Please enter the 9 digit number: ");
                int isbn = input.nextInt();
                
                //assigning each value a var
                int d2 = isbn % 10;
                int d3 = (isbn % 100) / 10;
                int d4 = (isbn % 1000) / 100;
                int d5 = (isbn % 10000) / 1000;
                int d6 = (isbn % 100000) / 10000;
                int d7 = (isbn % 1000000) / 100000;
                int d8 = (isbn % 10000000) / 1000000;
                int d9 = (isbn % 100000000) / 10000000;
                int d10 = (isbn % 1000000000) / 100000000;
                
                //finding checksum
                int sum = (d2*2) + (d3*3) + (d4*4) + (d5*5) + (d6*6) + (d7*7) + (d8*8) + (d9*9) + (d10*10);
                int d1 = sum % 11;
                
                //output
                System.out.println("the ISBN number is: " + isbn + d1);


        
        
    }
    
}
