
package anagrams;
import java.util.*;
public class Anagrams {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First word: ");
        String str1 = input.next();
        System.out.println("Second Word: ");
        String str2 = input.next();
        int sizestr2 = str2.length();
        int sizestr1 = str1.length();
        int anagram = 0;
        
        if(sizestr1 != sizestr2)
            System.out.println("False");
        else {
            for (int i = 0; i < sizestr2 ; i++) {
                for (int j = 0; j < sizestr1 ; j++) {
                    if(str1.charAt(i) == str2.charAt(j)) 
                    anagram++;
                 
                }
            }
        
            if(anagram>=sizestr1)
                System.out.println("True");
            else
                System.out.println("False");
        }
      
    }
    
}
