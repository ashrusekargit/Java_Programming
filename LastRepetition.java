import java.util.Scanner;
public class LastRepetition {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=1;i<=array.length;i++){
            array[i] = sc.nextInt();
        }*/
        int[] array = {10,20,30,40,20,50,10};
        int n = array.length;
        boolean flag = false;
        for(int i = n-1; i>0;i--){
            for(int j=0;j>0;j++){
                if(array[i] == array[j]){
                    System.out.println(array[i]);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
    }
}
