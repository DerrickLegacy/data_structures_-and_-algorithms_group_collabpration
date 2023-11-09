import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[][] multiArray = { { 9, 3, 7 }, { 2, 8, 5 }, { 4, 1, 6 } };

        System.out.println("Before sorting:");
        printArray(multiArray);

        for (int j = 0; j < multiArray[0].length; j++) {
            quickSortMultiArray(multiArray, 0, multiArray.length - 1, j); // Sort based on the j-th column
        }

        System.out.println("After sorting:");
        printArray(multiArray);
    }

    public static void quickSortMultiArray(int[][] multiArray, int low, int high, int column) {
        if (low < high) {
            int pivotIndex = partitionMultiArray(multiArray, low, high, column);

            quickSortMultiArray(multiArray, low, pivotIndex - 1, column);
            quickSortMultiArray(multiArray, pivotIndex + 1, high, column);
        }
    }

    public static int partitionMultiArray(int[][] multiArray, int low, int high, int column) {
        int[] pivot = multiArray[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (multiArray[j][column] <= pivot[column]) {
                i++;
                swapRows(multiArray, i, j);
            }
        }

        swapRows(multiArray, i + 1, high);

        return i + 1;
    }

    public static void swapRows(int[][] multiArray, int i, int j) {
        int[] temp = multiArray[i];
        multiArray[i] = multiArray[j];
        multiArray[j] = temp;
    }

    public static void printArray(int[][] multiArray) {
        for (int[] row : multiArray) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
