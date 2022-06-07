package pkg;

public class Pants extends Clothing{		
	public int length;
	
	public Pants(){
		this(0.0, "none", 0);
	}
	
	public Pants(double price){
		this(price, "none", 0);
	}
	
	public Pants(String producer){
		this(0.0, producer, 0);
	}
	
	public Pants(int length){
		this(0.0, "none", length);
	}
	
	public Pants(double price, String producer){
		this(price, producer, 0);
	}
	
	public Pants(double price, int length){
		this(price, "none", length);
	}
	
	public Pants(String producer, int length){
		this(0.0, producer, length);
	}
	
	public Pants(double price, String producer, int length){
		this.price = price;
		this.producer = producer;
		this.length = length;
	}
	
	public static int getLength(){
		return length;
	}
	
	public static void setLength(int length){
		this.length = length;
	}
}
