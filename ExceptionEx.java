import java.io.FileReader;

public class ExceptionEx {
    public static void main(String[] args) {
        System.out.println("Program Started");
        try{
          //  int result = 10 / 0;
          //  System.out.println(result);
            int[] arr = {1,2,3,4};
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index value is greater than array size");
        }
        finally{
            System.out.println("Final block");
        }
        System.out.println("Program Ended");
    }
}
