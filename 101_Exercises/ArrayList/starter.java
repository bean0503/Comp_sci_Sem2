import java.util.*;

class starter {
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();	
		System.out.println("How many values would you like to print?");
		int d = sc.nextInt();
		addValuesArrayList(d, ArrayList<Integer> arr);
		printArrayList(ArrayList<Integer> arr);

	}
	
	public static void printArrayList(Arraylist<Integer> arr){
		int c1 = arr.size();
		int c0 = 0;
		while(true){
			System.out.print(arr.get(c0) + " ");
			if(c0 == c1){
				break;
			}
			c0++;
		}
		return;
	}
	
	public static void addValuesArrayList(int n, ArrayList<Integer> arr){
		Random rand = new Random();
		int c = 0;
		int val = 0;
		int ce = arr.size();
		while(true){
			val = rand.nextInt(100) + 1;
			arr.add(c, val);
			if(c == ce){
				break;
			}
			c++;
		}
		return;
	}
}
