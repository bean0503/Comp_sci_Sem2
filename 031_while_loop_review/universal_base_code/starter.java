import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] y = new int[100];
		int c = 0;
		int r;
		int v;
		while(true){
			r = rand.nextInt(100);
			v = r + 1;
			y[c] = v;
			c++;
			if(c == 100){
				break;
			}
		}
		c = 0;
		while(true){
			System.out.println(y[c]);
			c++;
			if(c == 100){
				break;
			}
		}
		
	}
}
