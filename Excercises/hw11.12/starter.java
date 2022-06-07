import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] x = new int[20];
		int[] y = new int[20];
		int c = 0;
		int r;
		int p;
		while(true){
			r = rand.nextInt(50);
			p = r + 1;
			x[c] = p;
			c++;
			if(c == x.length){
				break;
			}
		}
		c = 0;
		while(true){
			System.out.println(x[c]);
			c++;
			if(c == x.length){
				break;
			}
		}
		int d = 19;
		c = 0;
		while(true){
			y[c] = x[d];
			d = d - 1;
			c++;
			if(c == y.length){
				break;
			}
		}
		c = 0;
		while(true){
			System.out.println(y[c]);
			c++;
			if(c == y.length){
				break;
			}
		}
	}
}