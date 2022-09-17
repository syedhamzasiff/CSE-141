
package palindromendigit;
import java.util.*;
public class PalindromeNDigit {

    public static void main(String[] args) {
        System.out.println("input any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int rev = 0;
        
        while (num1>0) {
            int rem = num1%10;
            num1=num1/10;
            rev=(rev*10)+rem;
            
        }
        System.out.println("The reverse is " + rev);
        if (rev==num)
            System.out.println("The number is a paindrome");
        else System.out.println("The number is not a palindrome");
    }
    
}
