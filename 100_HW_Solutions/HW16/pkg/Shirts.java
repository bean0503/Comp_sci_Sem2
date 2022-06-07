package pkg;

public class Shirts extends Clothing{		
	public String material;
	
	public Shirts(){
		this(0.0, "none", "none");
	}
	
	public Shirts(double price)){
		this(price, "none", "none");
	}
	
	public Shirts(String producer){
		this(0.0, producer, "none");
	}
	
	public Shirts(String material){
		this(0.0, "none", material);
	}s
	
	public Shirts(double price, String producer){
		this(price, producer, "none");
	}
	
	public Shirts(double price, String material){
		this(price, "none", material);
	}
	
	public Shirts(String producer, String material){
		this(0.0, producer, material);
	}
	
	public Shirts(double price, String producer, String material){
		this.price = price;
		this.producer = producer;
		this.material = material;
	}
	
	public static String getMaterial(){
		return material;
	}
	
	public static void setMaterial(String material){
		this.material = material;
	}
}
