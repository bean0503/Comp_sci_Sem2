import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] x = new int[20];
		int c = 0;
		int v;
		while(true){
			int r = rand.nextInt(10);
			v = r + 1;
			x[c] = v;
			c++;
			if(c == 20){
				break;
			}
		}
		
		/*c = 0;
		while(true){
			System.out.println(x[c]);
			c++;
			if( c == 20){
				break;
			}
		}
		*/
		
		int z = rand.nextInt(10);
		int q = z + 1;
		System.out.println("Find all duplicates of " + q);
		c = 0;
		int f = 0;
		int[] y = new int[20];
		while(true){
			if(x[c] == q){
				y[f] = c;
				f++;
			}
			c++;
			if(c == 20){
				break;
			}
		}
		c = 0;
		System.out.print("Where? ");
		while(true){
			System.out.print(y[c] + " ");
			c++;
			if(c == f){
				break;
			}
		}
		System.out.println("");
		System.out.println("There are " + f);
		
		c = 0;
		int g;
		int h;
		System.out.println("Are there 2 in a row? ");
		while(true){
			g = c;
			h = c + 1;
			if(x[g] == x[h]){
				System.out.println(x[g] + " repeats on " + g + " and " + h);
			}
			c++;
			if(c == 19){
				break;
			}
		}
	}
}