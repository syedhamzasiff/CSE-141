
package palindromestring;
import java.util.*;
public class PalindromeString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = input.next().toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = false;
                
        
        for (int i = 0; i < (word.length() / 2); i++) {
            if( word.charAt(left) == word.charAt(right)) {
                isPalindrome = true;
                left++;
                right--;
            } else {
                isPalindrome = false;
                System.out.println("not Palindrome");
                break;
            } 
            
        }
        if(isPalindrome)
            System.out.println("Palindrome");
        
        
       
        
        
    }
    
}
