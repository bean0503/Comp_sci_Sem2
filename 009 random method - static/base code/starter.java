import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	
	int a = rand.nextInt(10);
	
	int bx = rand.nextInt(100);
	int b;
	b = bx + 1;
	
	double cx = rand.nextDouble();
	double c;
	c = cx + 2.5;
	
	double dx = rand.nextDouble();
	int dy = rand.nextInt(575);
	double d;
	d = dy + dx + 14;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
}
