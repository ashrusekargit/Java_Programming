import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        /*int a = 10;
        switch (a) {
            case 1:
                System.out.println("First case");
                break;
            case 2:
                System.out.println("Second case");
                break;
            case 3:
                System.out.println("Third case");
                break;
            default:
                System.out.println("No such values");
                break;
        } - switch case ex 
       /*Scanner day = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = day.nextInt();
       switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a number from 1 to 7");
                break;
        } - days*/
         Scanner num = new Scanner(System.in);
         int a = num.nextInt();
         int b = num.nextInt();
         char c = num.next().charAt(0);
         switch (c) {
            case '+':
                System.out.println(a + "+" + b + "=" + a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("No such operation");
         }
    }
}