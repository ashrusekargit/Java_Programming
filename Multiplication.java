import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);
        int num = multi.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(num + "*" + i + " =" + num*i);
        }
    }
}
