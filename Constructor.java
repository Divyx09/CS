public class Constructor {

    private final String model;
    private final int year;

    // Constructor 
    public Constructor(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + "Year: " + year);
    }
}

class Main {

    public static void main(String[] args) {
        Constructor carl = new Constructor("Toyota Corolla", 2020);
        carl.displayInfo();
    }
}
