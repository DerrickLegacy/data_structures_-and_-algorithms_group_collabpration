public class SequentialSearch {

    // Sequential search function
    public static int sequentialSearch(int[] arr, int target) {
        // traverse through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the element is found
            }
        }
        return -1; // Element not found in the array
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        int target = 4;

        // Call the search function to find the target element
        int result = sequentialSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }

}
