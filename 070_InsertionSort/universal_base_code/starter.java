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
		insertionSort(arr);
		c = 0;
		while(true){
			System.out.println(arr[c]);
			c++;
			if(c == 200){
				break;
			}
		}
	}
	
	public static void insertionSort(int [] arr){
		int outer = 0;
		int inner = 0;
		int key = 0;
		for(outer = 1; outer < arr.length; outer++){
			key = arr[outer];
			inner = outer - 1;
			while(inner >= 0 && arr[inner] > key){
				arr[inner + 1] = arr[inner];
				inner = inner - 1;
			}
			arr[inner + 1] = key;
		}
	}
}
