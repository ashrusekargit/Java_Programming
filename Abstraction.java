abstract class Animal{  //abstract class contains both abstract and concrete method
    abstract void sound();  //abstract method
    void sleep(){   //concrete method->used by all child class
        System.out.println("sleeping");
    }
}


class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
