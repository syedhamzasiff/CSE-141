
package palindrome;
import java.util.*;

public class Palindrome {

    
    public static void main(String[] args) {
        System.out.println("enter 4 digit number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = (num / 1000)  ;
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = (num / 1) % 10;
        
        int A = a * 1;
        int B = b * 10;
        int C = c * 100;
        int D = d * 1000;
        
        int numbw = A + B + C + D;
        
        if ( numbw == num) {
            System.out.println("The number is Palindrome");
            
        } else System.out.println("The number is not Palindrome");
            
        
        
                
               
        
       
    }
    
}
