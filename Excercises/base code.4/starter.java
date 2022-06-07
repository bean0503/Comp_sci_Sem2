import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number ! ! !");
		int num = sc.nextInt();
		
		int count = 0;
		System.out.println(num);
		while(true){
			num = num + 1;
			System.out.println(num);
			count = count + 1;
			if(count == 4){
				break;
			}
		}
	}
}
