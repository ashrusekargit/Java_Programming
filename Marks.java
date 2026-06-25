import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int average;
        for(int i=1;i<=5;i++){
            int marks = input.nextInt();
            sum= sum+marks;
        }
        average = sum/5;
        if(average >= 40){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
    }
}
