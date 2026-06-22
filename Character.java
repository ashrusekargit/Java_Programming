import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char a = letter.next().charAt(0);
        int b = a;
        if(b>=65 && b<=90){
            System.out.println("The Character is Upper Case");
        }
        else if(b>=97 && b<=122){
            System.out.println("The Character is Lower Case");
        }
        else if(b>=48 && b<=57){
            System.out.println("The Character is a Number");
        }
        else{
            System.out.println("The Character is a Special Character");
        }

}
}
