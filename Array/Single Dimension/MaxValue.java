public class MaxValue {
    // Declare and initialize an array of doubles
    public static double[] array = {3.5, 78.3, 23.6, 81.3, 23.0};

    // Declare an array reference
    public static double[] az;

    // Method to find and print the maximum value in an array
    public static void getMax(double[] array) {
        // Check if the array is not null
        if (array != null) {
            // Initialize the current maximum value with the first element of the array
            double currentMax = array[0];

            // Iterate over the elements of the array
            for (int i = 0; i < array.length; i++) {
                // Update the current maximum value if a greater value is found
                if (array[i] > currentMax) {
                    currentMax = array[i];
                }

                // Print the current maximum value at each iteration (optional, for demonstration purposes)
                System.out.println(currentMax);
            }
        } else {
            // Print a message if the array is empty
            System.out.println("Array is empty");
        }
    }

    public static void main(String[] args) {
        // Call the getMax method with the 'array' array
        getMax(array);

        // Call the getMax method with the 'az' array (which is not initialized and is effectively empty)
        getMax(az);
    }
}
