import java.util.Arrays;

public class Selection_sort
{
    	public static void main(String args[])
	{
		Selection_sort ob = new Selection_sort();
		int arr[] = {2,3,6,54,56,87,34,24,52,43,12,90,56};
		ob.sort(arr);
		System.out.println("Sorted array");
		
        
        System.out.println(Arrays.toString(arr));
	}

	void sort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min = i; //i=1
			for (int j = i+1; j < n; j++)
				if (arr[j] > arr[min])
					min = j;
			// Swap the found minimum element with the first
			// element
			int temp = arr[min];
			arr[min] = arr[i];  // arr[3]=23 arr[]
			arr[i] = temp; // arra[0]=8
		}
	}

 }
