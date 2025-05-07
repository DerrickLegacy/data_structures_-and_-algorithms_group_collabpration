

import java.io.*;
import java.util.*;

public class Binary_search {

	// Returns index of x if it is present in arr[].
	int binarySearch(int arr[], int x)
	{
		int low = 0, high = arr.length -l;//this is the upper and lower index of the array, 
		//   ie l is the lower index, as r is the upper index
		while (low <= high) {
			int middleposition =(high) / 2; //lower bound 

			// Check if x is present at mid
			if (arr[middleposition] == x)
				return middleposition;

			// If x greater, ignore left half
			if (arr[middleposition] < x)
				low = middleposition + 1;

			// If x is smaller, ignore right half
			else
				high = middleposition - 1;
		}

		// If we reach here, then element was
		// not present
		return -1;
	}

	// Driver code
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
		Binary_search ob = new Binary_search();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		//int x = 10;
		System.out.println("Enter the element you want to search for??");
			int x = obj.nextInt();
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element "+x+" is present at "+ " index " + result);
	}
}
