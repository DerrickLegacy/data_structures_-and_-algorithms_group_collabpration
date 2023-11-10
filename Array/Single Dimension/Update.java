public class Update {
    public static void main(String[] args) {
        // inputs
        int [] arr = { 1, 2, 3, 4, 5, 78, 756, 29 };

        int sizeOfArry = arr.length;

        int[] arrCopy = new int[sizeOfArry + 1];
        int indexToUpdate = 4; // Adjusted for based indexing
        int value = 70;
        // check if index is within the length of the array to be updated
        if (indexToUpdate < sizeOfArry) {
            // copy items before specified index into dummy array, then copy data item to
            // the array location of specified dummy
            for (int i = 0; i < sizeOfArry; i++) {
                if (i < indexToUpdate) {
                    arrCopy[i] = arr[i];
                } else if (i == indexToUpdate) {
                    arrCopy[i] = arr[i];
                    arrCopy[i + 1] = value;
                } else {
                    arrCopy[i + 1] = arr[i];
                }
            }
        }
        for (int i = 0; i < arrCopy.length; i++) {
            System.out.println(arrCopy[i]);
        }
        // Deleting an array
        arr = null;
    }
}
