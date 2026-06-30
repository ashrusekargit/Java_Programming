import java.util.Scanner;
public class EquiIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sumL = 0, sumR=0;
        //input
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        //equilibrium
        /*for(int i=1; i<n-1;i++){
            sumL=0;
            sumR=0;
            //leftsum
            for(int j=i-1;j>=0;j--){
                sumL += array[j];
            }
            //rightsum
            for(int k=i+1;k<n;k++){
                sumR += array[k];
            }
            if(sumL == sumR){
                System.out.println(i);
                break;
            }
        }
        if(sumL != sumR){
                System.out.println("none");
            }*/

        int tot = 0;
        for(int i : array){
            tot += array[i];
        }
        int leftSum = 0;
        for(int i=0;i<n;i++){
            tot -= array[i];
            if(tot == leftSum){
                System.out.println(i);
            }
            leftSum += array[i];

        }

        
    }
}
