public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        int n = arr.length;

        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare and swap adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}