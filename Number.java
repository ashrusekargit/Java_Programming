import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number");
        int a = num.nextInt();
        if(a==0){
            System.out.println("The Number is zero");
        }
        else if(a>0){
            System.out.println("The Number is positive");
        }
        else{
            System.out.println("The Number is negative");
        }
        }   
    
}
