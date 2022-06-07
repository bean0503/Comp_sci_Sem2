import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] y = new int[10];
		int c = 0;
		int b = 9;
		while(true){
			y[c] = b;
			b = b - 1;
			c++;
			if(c == 10){
				break;
			}
		}
		c = 0;
		while(true){
			System.out.println(y[c]);
			c++;
			if(c == 10){
				break;
			}
		}
	}
}
