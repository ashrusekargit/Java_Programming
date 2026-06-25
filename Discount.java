import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*20% discount if bill amount > 5000
10% discount if bill amount > 2000
No discount otherwise

Write a program to:

Input prices of n products using a loop.
Calculate total bill.
Apply discount and display final amount.*/

    int n = sc.nextInt();
    int sum = 0;
    for(int i=0;i<n;i++){
        int price = sc.nextInt();
        sum += price;
    }
    if(sum>2000){
        float discount = (sum/100)*10;
        System.out.println(discount);
    }
    else if(sum>5000){
        float discount = (sum/100)*20;
        System.out.println(discount);
    }
    else{
        System.out.println("No Discount");
    }
    }
    
}
