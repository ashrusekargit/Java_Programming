public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // implicit type conversion (widening)
        System.out.println(b);

        double c = 20.5;
        int d = (int) c; // explicit type conversion (narrowing)
        System.out.println(d);
    }
}
