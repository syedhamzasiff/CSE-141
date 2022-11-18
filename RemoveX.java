
package removex;
import java.util.*;
public class RemoveX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter");
        String word = input.next();
        String reS = removeX(word);
        System.out.println(reS);
        System.out.println(word.length() - reS.length());
    }
    public static String removeX(String word) {
        if (word.length() ==1) {
            if (word.charAt(0) == 'x')
                return "";
            else return word;
        } else if (word.charAt(0) == 'x') 
            return removeX(word.substring(1));
        else 
            return word.charAt(0) + removeX(word.substring(1));
    }   
}