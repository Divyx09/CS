
interface Animal {

    public void sound(); //Interface method (does not have a body) 
}

class Dog implements Animal {
    @Override
    public void sound() { // The body of sound() is provided here 
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Interface {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }

}
