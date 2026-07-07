class Box<T>{
    T value;
    public void print(){
        System.out.println(value);
    }
}



public class GenericsEx {
    public static void main(String[] args) {
        Box<T> b= new Box();
        b.value = "Helloo";
        b.print();
 }   
}
