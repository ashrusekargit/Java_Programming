import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner units = new Scanner(System.in);
        int n = units.nextInt();
        if(n<=100){
            System.out.println(n*2);
        }        
        else if(n>100 && n>=200){
            System.out.println(200+(n-100)*3);
        }
        else{
            System.out.println(500+(n-200)*5);
        }
    }
    
}
