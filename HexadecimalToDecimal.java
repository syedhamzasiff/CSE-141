
package hexadecimaltodecimal;
import java.util.*;
public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Hexa value: ");
        char ch = input.next().charAt(0);
        
        
        if ('0' <= ch && ch <= '9') 
            System.out.println(ch);
        
        else if (ch>= 'A' && ch<='F') {
            int value = ch - 'A' + 10;
            System.out.println(value);
        }
        else System.out.println("invaid input");
    }
                
            
        
    
                
       
        
        
        
    }
    

