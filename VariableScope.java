
public class VariableScope {

    int c = 20; // instance variable

    public void calculateSum() {
        int a = 5; // local variable
        int b = 10; // local variable
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.calculateSum();
        System.out.println(obj.c);
    }
}
