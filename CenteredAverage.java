
package centeredaverage;
import java.util.*;
public class CenteredAverage {
    public static void main(String[] args) {
        int[] arr = inputArr();
        System.out.println(centeredAvg(arr));
    }
    
    public static int[] inputArr(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of numbers");
        boolean flag = true;
        boolean flg = true;
        int[] arr = new int[0];
        do{ 
            try {
                int num = input.nextInt();
                arr = new int[num];
                flag = false;
                
                for (int i = 0; i < num; i++) {
                    flg=true;
                    System.out.printf("enter num %d: ", i+1);
                    arr[i] = input.nextInt();
                    flg = false;
                } 
            }
            catch (InputMismatchException ex){
                System.out.println("input a different number");  
                input.nextLine();
            }  
        }while(flag || flg);
        
        return arr;
    }
    public static double centeredAvg(int[] arr){
        Arrays.sort(arr);
        double sum = 0;
        for (int i = 1; i < arr.length-1; i++) {
            sum += arr[i];
        }
        double avg = sum / (arr.length-2);
        return avg;
    }
}
