package pkg;

public class Rock implements Pet{
    String name;
    int age;
    boolean trained;
    
    public Rock(){
        this("Betty", 90, true);
    }
    
    public Rock(int age){
        this("Betty", age, true);
    }
    
    public Rock(boolean trained){
        this("Betty", 90, trained);
    }
    
    public Rock(String name){
        this(name, 90, true);
    }
    
    public Rock(String name, boolean trained){
        this(name, 90, trained);
    }
    
    public Rock(String name, int age, boolean trained){
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
        System.out.println(name + ": . . ." );
    }
    
    public void trick(){
        if(trained){
            System.out.println(name + "- goes on a marathon");
        }else{
            System.out.println(name + "- stays still");
        }
    }
}