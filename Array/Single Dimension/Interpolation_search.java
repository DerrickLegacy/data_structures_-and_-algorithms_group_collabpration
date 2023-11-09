public class Interpolation_search {
    public static void main(String[] args) {
        // Interpolation search: Improvement of binary search used for uniformly
        // distributed data
        int[] array = { 1, 2, 3, 4, 5, 33, 256, 7862, 7, 8, 9, 10 };
        int index = interpolation_search(array, 9);
        if (index != -1) {
            System.out.println("Element has been found at index :" + index);
        } else {
            System.out.println("Sorry Element not found");
        }
    }

    public static int interpolation_search(int[] array, int searchValue) {
        int high = array.length - 1;
        int low = 0;
        while (searchValue >= array[low] && searchValue <= array[high] && low <= high) {
            int guess = low + (high - low) * (searchValue - array[low]) / (array[high] - array[low]);
            System.out.println("Guess" + guess);

            if (array[guess] == searchValue) {
                return guess;
            } else if (array[guess] < searchValue) {
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }
        return -1;
    }
}