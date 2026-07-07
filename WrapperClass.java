public class WrapperClass {
    public static void main(String[] args) {
        int n=100;
        Integer i = Integer.valueOf(n); // Boxing
       // i = 200; // autoBoxing
        int b = i.intValue(); //unboxing
        int c=i; //autoUnboxing
        double a = 20.511255;
        Double d = Double.valueOf(a);
        System.out.println(i);
        }
}
