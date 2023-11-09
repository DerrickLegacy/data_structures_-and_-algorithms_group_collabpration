public class Update {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 6 }, { 5, 7, 6 }, { 98, 87, 21 }, { 9, 1, 6 } };
        int rows = arr.length;
        int cols = arr[0].length;

        int rowToUpdate = 2;
        int colToUpdate = 1;
        int value = 70;

        // Check if row and column indices are within bounds
        if (rowToUpdate >= 0 && rowToUpdate < rows && colToUpdate >= 0 && colToUpdate < cols) {
            // Create a copy of the original array with an extra row
            int[][] arrCopy = new int[rows + 1][cols];

            // Copy elements to the new array, inserting the updated value
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i < rowToUpdate || (i == rowToUpdate && j < colToUpdate)) {
                        arrCopy[i][j] = arr[i][j];
                    } else if (i == rowToUpdate && j == colToUpdate) {
                        arrCopy[i][j] = value;
                    } else {
                        arrCopy[i + 1][j] = arr[i][j];
                    }
                }
            }

            // Print the updated array
            for (int i = 0; i < arrCopy.length; i++) {
                System.out.print("[");
                for (int j = 0; j < arrCopy[i].length; j++) {
                    System.out.print(arrCopy[i][j] + ", ");
                }
                System.out.println("]");
            }
        } else {
            System.out.println("Invalid indices.");
        }
    }
}
