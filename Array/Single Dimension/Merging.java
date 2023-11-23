import java.util.*;

public class Merging {

    public static void main(String[] args) {
        // Declare and initialize two arrays
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {7, 8, 9};

        // Create a new array to store the merged elements of a and b
        int c[] = new int[a.length + b.length];

        // Copy elements from array 'a' to array 'c'
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy elements from array 'b' to array 'c' starting from the index after the last element of 'a'
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        // Print the merged array
        System.out.print(Arrays.toString(c));
    }
}
