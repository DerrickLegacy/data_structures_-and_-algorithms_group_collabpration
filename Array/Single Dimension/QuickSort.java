import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and obtain the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the subarrays on the left and right of the pivot
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choosing the last element as the pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot, swap it with
            // the element at index i+1
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high); // Place the pivot in its final sorted position

        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 9, 4, 2, 7, 1, 5, 8, 3, 6 };
        System.out.println("Before sorting: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}