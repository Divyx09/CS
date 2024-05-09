package packageHide;

class InnerClass { //package-private class, not accessible outside 'com.example.project' package
    void display() {
        System.out.println("Hello from Inner Class!");
    }
}

public class Hide {
    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.display();
    }
}