class Employee{
    String name;
    int age;
    void print(){
        System.out.println("Welcome");
    }
    void details(String name, int age){
        System.out.println("Name: "+name+", Age: "+ age);
    }
}

class Manager extends Employee{
    int age =12;
    void detail(){
        System.out.println(age); //local value
        System.out.println(super.age); //parent value
    }


}

class Developer extends Employee{

}

public class Inheritance {
    public static void main(String[] args) {
        Manager details = new Manager();
        Employee details1 = new Developer();
        details.print();
        details.detail();
        details1.details("Arun", 27);

    }
}
