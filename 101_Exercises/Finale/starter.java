import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};
		int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr1);
		int mode2 = getMode(arr2);
		int mode3 = getMode(arr3);
		
		int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr5 = {1, 2, 3, 4, 5, 6};
		int median1 = getMedian(int[]arr4);
		int median2 = getMedian(int[]arr5);

	}
	
	public static int getMode(int [] x){
		int mode = -1;
		int max = getArrayMax(x);
		int [] count = new int [max];
		int [] nums = new int[x.length];
		int c1= 0;
		int c2 = 0;
		int mode = 0;
		while(true){
			c2 = x[c1];
			count[c2] = count[c2] + 1;
			if(c1 == x.length){
				break;
			}
			c1++;
		}
		return mode; 
	}
	
	public static int getArrayMax(int[]y){
		int c = 0;
		int max = 0;
		while(true){
			if(y[c] > max){
				max = y[c];
			}
			c++;
			if(c == y.length){
				break;
			}
		}
		return max;
	}
	
	public static int getMedian(int [] x){
		
	}
}
