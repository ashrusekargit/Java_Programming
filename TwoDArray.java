import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        //input
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j] = sc.nextInt();
            }
        }


        //print
        /*for(int i = 0 ;i<n;i++){
            for(int j = 0; j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/


        //sum_of_all elements
       /*  int sum = 0;
        for(int i = 0 ;i<n;i++){
            for(int j = 0; j<m;j++){
                sum+=array[i][j];
            }
            
        }
        System.out.println(sum);*/


        //RowSum
        /*for(int i =0;i<array.length;i++){
            int rowSum = 0;
            for(int j = 0; j<m;j++){
                rowSum+=array[i][j];
            }
            System.out.println(rowSum);
        }*/
            
        //ColumnSum
        for(int j =0;j<array.length;j++){ //i
            int ColumnSum = 0;
            for(int i = 0; i<m;i++){ //j //array[0].length - no of col
                ColumnSum += array[i][j]; // array[j][i];
            }
            System.out.println(ColumnSum);
           
        }
    }
    
}
