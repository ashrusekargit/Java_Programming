import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner interest = new Scanner(System.in);
        System.out.print("Enter the Principle Amount: ");
        int p = interest.nextInt();
        System.out.print("Enter the Rate of Interest: ");
        int r = interest.nextInt();
        System.out.print("Enter the Time: ");
        int t = interest.nextInt();
        int SimpleInterest = (p*r*t)/100;
        System.out.println("Simple Interest: "+SimpleInterest);
    }
}
