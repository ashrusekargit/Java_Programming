import java.util.Scanner;
public class Hello{
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        /*int b=input.nextInt();
        int a=input.nextInt();
        int c = a+b;
        System.out.println("Input:"+a);
        System.out.println("Input:"+b);*/
        String s = input.next();
        char c = input.next().charAt(0);
        System.out.println(s);
        System.out.println(c);
    }
}