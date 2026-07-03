class Car{
    String make ="default";
    String model ="default";
    int year=0;
    void Displayinfo(){
        System.out.print("Year: "+year+", "+"Make: "+make+", "+"Model: "+model);
    }
    Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Car info = new Car("Toyota", "corolle", 2021);
        info.Displayinfo();
    }
}
