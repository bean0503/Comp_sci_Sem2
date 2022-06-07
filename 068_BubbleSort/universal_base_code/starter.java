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
		bubbleSort(arr);
		c = 0;
		while(true){
			System.out.println(arr[c]);
			c++;
			if(c == 200){
				break;
			}
		}
	}
	
	public static void bubbleSort(int [] arr){
		for(int outer = 0; outer < arr.length - 1; outer++){
			for(int inner = 0; inner < arr.length - outer - 1; inner++){
				if(arr[inner] > arr[inner + 1]){
					int temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}
	}
}
