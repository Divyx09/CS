public class TypeCasting {
    public static void main(String[] args) { 
        //Implicit casting (automatic type conversion) 
        int myint=9; 
        double myDouble = myint; 
        System.out.println("Int value: "+myint); 
        System.out.println("Converted to double: "+myDouble); 
        //Explicit casting (manual type conversion) 
        double anotherDouble=9.78; 
        int anotherInt = (int) anotherDouble; 
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Converted to int: "+anotherInt); 
}}
