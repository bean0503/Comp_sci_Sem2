import java.util.*;

class starter {
	

	public static void main(String args[]) {
		boolean a = isLongSeq(1);
		System.out.println(a);
		System.out.println((int)(Math.random() * 4));
	}
	 
	public static int hailstoneLength(int n){
		ArrayList <Integer> x = new ArrayList<Integer>();
		x.add(n);
		while(true){
			if(n == 1){
				break;
			}else if((n%2) == 1){
				n = (3 * n) + 1;
				x.add(n);
				if(n == 1){
					break;
				}
			}else if((n%2) == 0){
				n = n / 2;
				x.add(n);
				if(n == 1){
					break;
				}
			}
		}
		return x.size();
	}
	
	public static boolean isLongSeq(int n){
		int len = hailstoneLength(n);
		if(len > n){
			return true;
		}else{
			return false;
		}
	}
	
	public static double propLong(int n){
		double c = 0.0;
		boolean b;
		for(int i = 1; i <= n; i++){
			b = isLongSeq(i);
			if(b){
				c++;
			}
		}
		return c / n;
	}
	
}
