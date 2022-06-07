package pkg;

public class Socks extends Clothing{		
	public String type;
	
	public Socks(){
		this(0.0, "none", "none");
	}
	
	public Socks(double price){
		this(price, "none", "none");
	}
	
	public Socks(String producer){
		this(0.0, producer, "none");
	}
	
	public Socks(String type){
		this(0.0, "none", type);
	}
	
	public Socks(double price, String Producer){
		this(price, producer, "none");
	}
	
	public Socks(double price, String type){
		this(price, "none", type);
	}
	
	public Socks(String producer, String type){
		this(0.0, producer, type);
	}
	
	public Socks(double price, String producer, String type){
		this.price = price;
		this.producer = producer;
		this.type = type;
	}
	
	public static String getType(){
		return type;
	}
	
	public static void setType(){
		this.type = type;
	}
}
