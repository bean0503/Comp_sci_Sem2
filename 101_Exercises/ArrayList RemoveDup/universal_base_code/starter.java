import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		System.out.println("");
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*100));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void removeDup(ArrayList<Integer> arr){
		int e = 0; //counter
		int t = 0; //value
		int b = 0; //value checker
		int d = 1; //value checker counter
		int a = arr.size(); //checker size
		while(true){
			t = arr.get(e);
			while(true){
				b = arr.get(a - d);
				if(t == b){
					arr.remove(a - d);
					a = arr.size();
				}
				if(a == d){
					break;
				}
				d++;
			}
			e++;
			if(e == a){
				break;
			}
		}
		return;
	}
}

