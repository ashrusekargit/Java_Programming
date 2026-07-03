class Calculate{
    //method overloading
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }
}

//method overriding
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
    @Override //anotation-check for correct name of method and existance of method in parent
    void details(String name, int age){
        System.out.println(++age);
        System.out.println("Name: "+name+", Age: "+ age);
    }
    
}

class Developer extends Employee{

}

public class Polymorphism {
    public static void main(String[] args) {
        Calculate sc =new Calculate();
        sc.add(10,10);
        sc.add(1,2,3);
        sc.add(10.2,14.3);
        //Employee a = new Manager();
        //a.details("raj",15); //runtime choose which class to run
        //Employee b = new Developer();
        //b.details("happy", 12);
        //Employee a;
       // a = new Manager();
        //a.details("happy", 74);
        //a = new Developer();
        //a.details("happy", 78);
        Employee[] array = {new Employee(), new Manager(), new Developer()};
        for(Employee a : array){
            a.details("apple", 78);
        }
    }
}
