import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int sizer = rand.nextInt(150);
		int size = sizer + 52;
		int[] y = new int[size];
		
		int c = 0;
		while(true){
			int a = rand.nextInt(100) + 1;
			y[c] = a;
			c++;
			if(c == size){
				break;
			}
		}
		
		c = 0;
		int min = 100;
		while(true){
			if(y[c] < min){
				min = y[c];
			}
			c++;
			if(c == size){
				break;
			}
		}
		System.out.println("The minimum is " + min);
		
		c = 0;
		int max = 1;
		while(true){
			if(y[c] > max){
				max = y[c];
			}
			c++;
			if(c == size){
				break;
			}
		}
		System.out.println("The maximum is " + max);
		
		c = 0;
		int avg = 0;
		while(true){
			avg = avg + y[c];
			c++;
			if(c == size){
				break;
			}
		}
		avg = avg/size;
		System.out.println("The average is " + avg);
	}
}
