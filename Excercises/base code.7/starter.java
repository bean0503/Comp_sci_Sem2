import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		cat x = new cat();
		cat y = new cat("Nermal");
		x.meow();
		y.meow();
	}
} 

class cat{
	String c;
	public cat(){
		c = "Garfield";
	}
	public cat(String d){
		c = d;
	}
	public void meow(){
		System.out.println(c + " meows");
		return;
	}
}