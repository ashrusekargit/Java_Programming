interface flyable{
    int a = 100;    //static and final
    void fly();  //public and abstract
    
}


interface Speed{
    void fly();
    default boolean Canfly(){
        return true;
    }
}


class Bird implements flyable{
    
    public void fly(){
        System.out.println("Birds can fly");
    }
}

class Aeroplane implements flyable{
    public void fly(){
        System.out.println("Plane can fly");
    }
}

class Jet implements flyable, Speed{
    public void fly(){
        System.out.println("Jet can fly in high speed");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Bird b = new Bird();
        Jet j = new Jet();
        System.out.println(b.a);
        j.fly();
    }
}
