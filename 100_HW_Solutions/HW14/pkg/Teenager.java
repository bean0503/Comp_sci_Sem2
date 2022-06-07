package pkg;

public class Teenager implements Pet{
    String name;
    int age;
    boolean trained;
    
    public Teenager(){
        this("Caden", 16, false);
    }
    
    public Teenager(int age){
        this("Caden", age, false);
    }
    
    public Teenager(boolean trained){
        this("Caden", 16, trained);
    }
    
    public Teenager(String name){
        this(name, 16, false);
    }
    
    public Teenager(String name, boolean trained){
        this(name, 16, trained);
    }
    
    public Teenager(String name, int age, boolean trained){
        this.name = name;
        this.age = age;
        this.trained = trained;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setIsTrained(boolean trained){
        this.trained = trained;
    }
    
    public boolean getIsTrained(){
        return trained;
    }
    
    public void interact(){
        System.out.println(name + ": Hi" );
    }
    
    public void trick(){
        if(trained){
            System.out.println(name + "- Goes to actually do something productive");
        }else{
            System.out.println(name + ": I dont feel like it");
        }
    }
}