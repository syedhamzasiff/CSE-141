
package numberpyramid;
import java.util.*;
public class NumberPyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input: ");
        int num = input.nextInt();
        
        for (int r = 1; r <num; r++) {    //row
            
            for (int sp = num-r-1; sp >0; sp--) {   //space
                System.out.print(" ");
            }
            
            for (int f=1; f<=r; f++) {     //forward number
                System.out.print(f);
                
            }       
            
            for (int b=r-1; b>0; b--) {    //backward numbers
                System.out.print(b);             
                
            }
            System.out.println("");
            }
        
        }
        
    }
    

