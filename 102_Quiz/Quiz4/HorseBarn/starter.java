import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
	
	
}

public class Horsebarn{
	public static int findHorseSpace(String name){
		int l = x.length;
		int c = 0;
		String a = name;
		int space;
		while(true){
			if(a.equals(Horse[c].getName())){
				space = c;
				break;
			}
			c++;
			if(l == c){
				space = -1;
				break;
			}
		}
		return space;
	}
	
	public void consolidate(){
		int [] x = new int[Horse.length];
		int c = 0;
		while(true){
			if(findHorseSpace(Horse[c].getName()) == c){
				x[c] = c;
			}else{
				x[c] = -1;
			}
			c++;
			if(c == x.length){
				break;
			}
		}
		
		c = 0;
		int d = 1;
		boolean isit = false;
		while(true){
			if(x[c] = -1){
				if(x[c + 1] >= 0){
					Horse[c] = Horse[c + 1];
					Horse[c + 1] = null;
				}else if(x[c + d] < 0){
					while(true){
						if(x[c + d] < 0){
							d++;
						}else if(x[c + d] >= 0){
							Horse[c] = Horse[c + d];
							Horse[c + d] = null;
							d = 1;
							break;
						}else if(x.length == (c + d - 1)){
							isit = true;
							break;
						}
					}
				}
			}
			if(isit){
				break;
			}
			c++;
			if(c == x.length){
				break;
			}
		}
	}
}