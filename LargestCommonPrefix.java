
package largestcommonprefix;
import java.util.*;
public class LargestCommonPrefix {
    public static void main(String[] args) {
        
        
       String str1 = "ggu tfyu tf";
       String str2 = "ggu gyi ui";
       String str3 = "";
       
        for (int i = 0; i < 10; i++) {
            if (str1.charAt(i)==(str2.charAt(i)))
                str3 = str3 + str1.charAt(i);
            
        }
        System.out.printf("The common prefix is %s", str3);
        
        if (str3=="")
            System.out.printf("%s and %s have no common prefix", str1, str2);
               
               
        
       
    }
    
}
