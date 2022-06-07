package pkg;

public class DesignerShirts extends Shirts{		
	public String brand;
	
	public DesignerShirts(){
		this(0.0, "none", "none", "none");
	}
	
	public DesignerShirts(double price){
		this(price, "none", "none", "none");
	}
	
	public DesignerShirts(String producer){
		this(0.0, producer, "none", "none");
	}
	
	public DesignerShirts(String material){
		this(0.0, "none", material, "none");
	}
	
	public DesignerShirts(String brand){
		this(0.0, "none", "none", brand);
	}
	
	public DesignerShirts(double price, String producer){
		this(price, producer, "none", "none");
	}
	
	public DesignerShirts(double price, String material){
		this(price, "none", material, "none");
	}
	
	public DesignerShirts(double price, String brand){
		this(price, "none", "none", brand);
	}
	
	public DesignerShirts(String producer, String material){
		this(0.0, producer, material, "none");
	}
	
	public DesignerShirts(String producer, String brand){
		this(0.0, producer, "none", brand);
	}
	
	public DesignerShirts(String material, String brand){
		this(0.0, "none", material, brand);
	}
	
	public DesignerShirts(double price, String producer, String material){
		this(price, producer, material, "none");
	}
	
	public DesignerShirts(double price, String producer, String brand){
		this(price, producer, "none", brand);
	}
	
	public DesignerShirts(double price, String material, String brand){
		this(price, "none", material, brand);
	}
	
	public DesignerShirts(String producer, String material, String brand){
		this(0.0, producer, material, brand);
	}
	
	public DesignerShirts(double price, String producer, String material, String brand){
		this.price = price;
		this.producer = producer;
		this.material = material;
		this.brand = brand;
	}
	
	public static String getBrand(){
		return brand;
	}
	
	public static void setBrand(String brand){
		this.brand = brand;
	}
}
