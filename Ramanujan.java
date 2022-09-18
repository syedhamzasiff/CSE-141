


package ramanujan;
import java.util.*;
public class Ramanujan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        
        int n = input.nextInt();
        int a;
        int b;
        int c;
        int d;
        int a3;
        int b3;
        int c3;
        int d3;
        int ans;
        
        
        for(a = 1; a<=n ; a++) {
            a3 = (int) Math.pow(a,3);
            if(a3>n)
                break;
            for(b = a; b<=n ;b++) {
                b3 = (int) Math.pow(b,3);
                if (a3 + b3 > n)
                    break;
                
                for(c=a + 1; c<=n; c++) {
                    c3 = (int) Math.pow(c, 3);
                    if (c3 > n)
                        break;
                    
                    for(d=c; d<=n; d++) {
                    d3 = (int) Math.pow(d, 3);
                    if (c3 + d3 > n)
                         break;
                    
                    ans = a3 + b3;
                    if (c3 + d3 == a3 + b3) {
                            System.out.print((a3+b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                    }   
                    
                }
               
            }
        }
    }
    }  
}
    
