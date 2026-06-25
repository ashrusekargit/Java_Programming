import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int rev = 0;
        while (n>0) {
            int digit = n%10;
            rev = rev * 10 + digit;  
            n = n/10;
        }
        if (rev == n){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        System.out.println(rev);

    }

}