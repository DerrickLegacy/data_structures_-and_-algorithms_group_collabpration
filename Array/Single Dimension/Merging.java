import java.util.*;

public class Merging {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {7, 8, 9};
        int c[] = new int[a.length + b.length];

      
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        // Print the merged array
    
            System.out.print(Arrays.toString(c));
        //}
    }
}
