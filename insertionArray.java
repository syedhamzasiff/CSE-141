import java.util.*;
public class insertionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of elements <=20");
        int size = input.nextInt();
        System.out.printf("enter %d elements in ascending order", size);
        System.out.println("");
        int[] arr = new int[21];
        for (int i = 0; i < size; i++) {
            System.out.printf("number %d: ", i+1);
            arr[i] = input.nextInt();
        }
        System.out.println("enter the element to be inserted");
        int insert = input.nextInt();
        int[] arr1 = insertionarray(arr, insert, size);
        for (int i = 0; i < size+1; i++) {
            System.out.print(arr1[i]);
        }

    }
    public static int[] insertionarray(int[] arr, int insert, int size) {
        int pos = 0;
        for (int i = 0; i < size; i++) {         //finding the position
            if(insert>arr[i] && insert<arr[i+1]) {
                pos = i;
            }  
        }
        for (int j = size; j > pos; j--) {       //copy one forward
            int shift = arr[j];
            arr[j+1] = shift;
        }
        arr[pos] = insert;
        return arr;

    }
}
