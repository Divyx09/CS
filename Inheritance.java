class Animals2{
    public void eat(){
        System.out.println("Eating Food");
    }
}

class lion extends Animals2{
    public void roar(){
        System.out.println("Lion Roars Louder");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        lion obj = new lion();
        obj.eat();
        obj.roar();
    }  
}