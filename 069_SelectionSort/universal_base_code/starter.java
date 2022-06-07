import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[]arr = new int[200];
		int c = 0;
		Random rand = new Random();
		while(true){
			arr[c] = rand.nextInt(200) + 1;
			c++;
			if(c == 200){
				break;
			}
		}
		selectionSort(arr, arr.length);
		c = 0;
		while(true){
			System.out.println(arr[c]);
			c++;
			if(c == 200){
				break;
			}
		}
	}
	
	public static void selectionSort(int arr[], int n){
		for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
	}
}
