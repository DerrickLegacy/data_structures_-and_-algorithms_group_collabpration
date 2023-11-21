import java.util.Arrays;

public class BubbleSort {

    
     public static void main(String[] args) {
        int[] arr = {4,3,1};
        int n = arr.length;

        // Outer loop to control the number of passes
        for (int i = 0; i < n-1; i++) {
            System.out.println("Iteration "+i);

            // Inner loop to compare and swap adjacent elements and subtracting a i for optimization.
            for (int j = 0; j < n -i- 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }

        }

        // Printing the sorted array
        for (int element : arr) {
            System.out.print(element + " ");
        }
        }
    }
    
    

