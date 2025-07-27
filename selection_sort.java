import java.util.*;
public class selection_sort{
       public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest_Index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest_Index]) {
                    smallest_Index = j;
                }
            }

            // Swap arr[i] and arr[smallest_Index]
            int temp = arr[i];
            arr[i] = arr[smallest_Index];
            arr[smallest_Index] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}