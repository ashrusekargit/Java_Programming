import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = num.nextInt();
        System.out.print("Enter the second number");
        int b = num.nextInt();
        System.out.print("Enter the third number");
        int c = num.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number is " + a);
        }
        else if(b>a && b>c){
            System.out.println("The largest number is " + b);
        }
        else {
            System.out.println("The largest number is " + c);
        }
        }
    
}
