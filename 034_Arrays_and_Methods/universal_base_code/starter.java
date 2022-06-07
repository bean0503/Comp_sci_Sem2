import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int c = 0;
		int[]y = new int[100];
		while(true){
			int v = rand.nextInt(100) + 1;
			y[c] = v;
			if(c == 100){
				break;
			}
		}
		toStringArray(y);
		int avge = getArrayAverage(y);
		int maxi = getArrayMax(y);
		int mini = getArrazyMin(y);
		System.out.println("The average is " + avge);
		System.out.println("The maximum is " + maxi);
		System.out.println("The minimum is " + mini);
	}
	
	public static void toStringArray(int[]y){
		int c = 0;
		while(true){
			System.out.print(y[c] + " ");
			c++;
			if(c == 100){
				break;
			}
		}
		System.out.println("");
		return;
	}
	
	public static int getArrayAverage(int[]y){
		int c = 0;
		int avg = 0;
		while(true){
			avg = avg + y[c];
			c++;
			if(c == 100){
				break;
			}
		}
		avg = avg/100;
		return avg;
	}
	
	public static int getArrayMax(int[]y){
		int c = 0;
		int max = 1;
		while(true){
			if(y[c] > max){
				max = y[c];
			}
			c++;
			if(c == 100){
				break;
			}
		}
		return max;
	}
	
	public static int getArrazyMin(int[]y){
		int c = 0;
		int min = 100;
		while(true){
			if(y[c] < min){
				min = y[c];
			}
			c++;
			if(c == 100){
				break;
			}
		}
		return min;
	}
}
