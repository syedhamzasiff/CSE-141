
package bubblesort;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size; ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {    //input
            System.out.printf("enter number %d: ", i+1);
            System.out.println("");
            arr[i] = input.nextInt();
        }
        System.out.println("unsorted: ");
        for (int i = 0; i < size; i++) {    //displaying unsorted
            System.out.println(arr[i]);
        }
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        System.out.println("The sorted list is: ");
        for (int i = 0; i < size; i++) {    //displaying sorted
            System.out.println(arr[i]);
    }
    }
}

    

