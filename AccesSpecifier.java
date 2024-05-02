
public class AccesSpecifier {

    public int a = 10;
    private int b = 20;
    protected int c = 30;

    public void m1() {
        System.out.println(b);
        System.out.println(a);
    }
}

class InnerAccesSpecifier {

    public static void main(String[] args) {
        AccesSpecifier obj = new AccesSpecifier();
        obj.m1();
        System.out.println(obj.a);
        System.out.println(obj.c);
    }

}
