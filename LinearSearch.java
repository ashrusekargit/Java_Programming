import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n;i++){
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean isFound = false;
        for(int i:array){
            if(i == target){
                System.out.println("value found");
                isFound = true;
            }
        }
        if(!isFound){
                System.out.println("value not found");
            }
            /*else{
                System.out.println("value not found");
            }*/
    }
}
