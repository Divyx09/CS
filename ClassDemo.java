public class ClassDemo { 
    private final  String model;
    private final String color;
    // Constructor 
    public ClassDemo(String color, String model) { 
    this.color=color;
    this.model = model; 
    } 
    //Method 
    public void displayInfo() { 
        System.out.println("Car model: "+ model +", Color: "+color);
    } 
    public static void main(String[] args) { 
        ClassDemo obj = new ClassDemo("yellow", "Toyota Corolla");
        obj.displayInfo(); 
    } 

}