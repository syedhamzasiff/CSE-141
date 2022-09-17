
package highestdivisor;
import java.util.*;

public class HighestDivisor {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first numbers");
        int a = in.nextInt();
        System.out.println("enter the two numbers");
        int b = in.nextInt();
        
        int div = 2;
        int gcd = 1;
        
        while ((div<a) && (div<b)) {
            if ((a%div==0) && (b%div==0)) {
                 gcd = div;
            }
            gcd++;
            
    
        } 
        
        System.out.println("Gcd is" + gcd);
    }
    
}
