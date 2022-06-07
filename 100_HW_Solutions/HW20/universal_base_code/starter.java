import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer>arr = new ArrayList<Integer>();
		Random rand = new Random();
		int c = 0;
		while(c < 100){
			arr.add(rand.nextInt(100) + 1);
			c++;
		}
		ArrayList<Integer>arrb = bubbleSort(arr);
		ArrayList<Integer>arrs = selectionSort(arr);
		ArrayList<Integer>arri = insertionSort(arr);
		insertionSort(arr);
		System.out.print("Unsorted Array: ");
		print(arr);
		System.out.print("Bubble Sort Array: ");
		print(arrb);
		System.out.println("Bubble Median: " + findMedian(arrb));
		System.out.print("Selection Sort Array: ");
		print(arrs);
		System.out.println("Selection Median:" + findMedian(arrs));
		System.out.print("Insertion Sort Array: ");
		print(arri);
		System.out.println("Insertion Median: " + findMedian(arri)); 
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer>arr){
		ArrayList<Integer>arrf = clone(arr);
		for(int outer = 0; outer < arrf.size() - 1; outer++){
			for(int inner = 0; inner < arrf.size() - outer - 1; inner++){
				if(arrf.get(inner) > arrf.get(inner + 1)){
					int temp = arrf.get(inner);
					arrf.set(inner, arrf.get(inner + 1));
					arrf.set(inner + 1, temp);
				}
			}
		}
		return arrf;
	}
	
	public static ArrayList<Integer> selectionSort(ArrayList<Integer>arr){
		ArrayList<Integer>arrf = clone(arr);
		for (int i = 0; i < arrf.size() - 1; i++){
            int min_idx = i;
            for (int j = i + 1; j < arrf.size(); j++){
                if(arrf.get(j) < arrf.get(min_idx)){
                    min_idx = j;
            	}
            }
            int temp = arrf.get(min_idx);
            arrf.set(min_idx, arrf.get(i));
            arrf.set(i, temp);
        }
        return arrf;
	}
	
	public static ArrayList<Integer> insertionSort(ArrayList<Integer>arr){
		ArrayList<Integer>arrf = clone(arr);
		int outer = 0;
		int inner = 0;
		int key = 0;
		for(outer = 1; outer < arrf.size(); outer++){
			key = arrf.get(outer);
			inner = outer - 1;
			while((inner >= 0) && (arrf.get(inner) > key)){
				arrf.set(inner + 1, arrf.get(inner));
				inner--;
			}
			arrf.set(inner + 1, key);
		}
		return arrf;
	}
	
	public static ArrayList<Integer> clone(ArrayList<Integer>arr){
		ArrayList<Integer>arrf = new ArrayList<Integer>();
		int c = 0;
		while(c < arr.size()){
			arrf.add(arr.get(c));
			c++;
		}
		return arrf;
	}
	
	public static void print(ArrayList<Integer>arr){
		int c = 0;
		while(c < arr.size() - 1){
			System.out.print(arr.get(c) + ", ");
			c++;
		}
		System.out.println(arr.get(c));
		System.out.println("");
		return;
	}
	public static double findMedian(ArrayList<Integer>arr){
		int s = arr.size();
		double median = 0;
		if((s % 2) == 0){
			s = arr.size() / 2;
			int s2 = s + 1;
			int wee = arr.get(s);
			int woo = arr.get(s2);
			median = (wee + woo) / 2;
		}else if((s % 2) == 1){
			s = arr.size() / 2;
			median = arr.get(s);
		}
		return median;
	}
}
