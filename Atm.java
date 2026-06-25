import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner pin = new Scanner(System.in);
        int Pin = 1234;
        int count = 1;
        while(count <= 3){
            int userpin = pin.nextInt();
            if(userpin == Pin){
                System.out.println("Access Granted");
            }
            else if(userpin != Pin && count == 1){
                System.out.println("You have two more Attempt");
            }
            else if(userpin != Pin && count == 2){
                System.out.println("You have one more Attempt");
            }
            else{
                System.out.println("Access Denied");
            }
            count++;
        }
    }
}
