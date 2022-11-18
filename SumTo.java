
package sumto;
import java.util.*;
public class SumTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num");
        int num = input.nextInt();
        System.out.println(sumTo(num));
    }
    public static double sumTo(int n) {
        if (n == 1)
            return 1.0;
        else {
            return 1.0/n + sumTo(n-1);
        }
    }
}
