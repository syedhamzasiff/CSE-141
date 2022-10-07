
package validpassword;
import java.util.*;
public class ValidPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pw = input.nextLine();
        
        //initializing the password checks
        
        boolean odl = false;
        boolean twodig = false;
        boolean onelett = false;
        int digit = 0;
        int letter = 0;
        
        //length = 10
        int size = pw.length();
        
        //only letter and digits   48, 65, 97
        for (int i = 0; i < pw.length(); i++) {
            char dl = pw.charAt(i);
            if( dl>=48 && dl<=57 || dl>=65 && dl<=90 || dl>=97 && dl<=122) 
                odl = true;
            else {
                odl = false;
                break;
            }    
        }
        //atleast one letter dgitits
        for (int i = 0; i < size; i++) {
            char l = pw.charAt(i);
            if(l>=65 && l<=90 || l>=97 && l<=122)
                letter++;    
        }
        if(letter>=1)
            onelett = true;
        
        //atleast one letter  65 & 97
        for (int i = 0; i < size; i++) {
            char d = pw.charAt(i);
            if(d>=48 && d<=57)
                digit++;     
        }
        if(digit>=2)
            twodig = true;
        
        //final printing            
                    
        if(size>=10 && odl == true && twodig == true && onelett == true)
            System.out.println("The password is valid");
        else
            System.out.println("Invalid Password");
        
        
    }
    
}
