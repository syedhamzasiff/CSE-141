
package mergesortedarrays;
import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array 1; ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {    //input
            System.out.printf("enter number %d: ", i+1);
            System.out.println("");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < size1; i++) {  //outer loop
            for (int j = 0; j < size1 ; j++) {    //inner loop
                if(arr1[i] < arr1[j]) { 
                    int temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            } 
        }
        System.out.println("Enter size of array 2; ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {    //input
            System.out.printf("enter number %d: ", i+1);
            System.out.println("");
            arr2[i] = input.nextInt();
        }
        for (int i = 0; i < size2; i++) {  //outer loop
            for (int j = 0; j < size2 ; j++) {    //inner loop
                if(arr2[i] < arr2[j]) { 
                    int temp = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp;
                }
            } 
        }
        int[] arr3 = new int[size1+size2];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        
        while(a1<size1 && a2<size2){
            if(arr1[a1]<arr2[a2]) {
                arr3[a3] = arr1[a1];
                a1++;
                a3++; 
            }
            else if(arr1[a1]>arr2[a2]) {
                arr3[a3] = arr2[a2];
                a2++;
                a3++; 
            }
            else{
                arr3[a3] = arr2[a2];
                a2++;
                a3++;
            }
        }
        if(a1==size1)
            while(a2<size2){
                arr3[a3] = arr2[a2];
                a3++;
                a2++;
            }
        if(a2==size2)
            while(a1<size1){
                arr3[a3] = arr1[a1];
                a3++;
                a1++;
            }
        System.out.println("sorted: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
    
}
