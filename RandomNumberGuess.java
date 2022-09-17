
package randomnumberguess;
import java.util.*;
public class RandomNumberGuess {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int num = (int)(Math.random()*101);
      char ch;
      
      do{
          
          
        for (int i=0 ; i<5 ; i++  ) {
           System.out.println("Enter your number: ");
           int guess = in.nextInt();
           if (guess>num)
              System.out.println("too large");
           else if (guess<num)
              System.out.println("too low");
           else {
              System.out.println("Your answer is correct");
              break;
              
           }

        }
          System.out.println("the answer was " + num);
          System.out.println("Do you want to continue press y");
          ch = in.next().charAt(0);
      } while (ch=='y' || ch=='Y');
        System.out.println("GAME OVER");
     
        
              
       }    
      
      
    }
    

