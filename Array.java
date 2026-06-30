import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
      /*  // printing array elements
        int[] array = new int[5];
        for(int i=0; i<array.length;i++){
            array[i] = num.nextInt();
            System.out.print(array[i] + " ");        //user input
        }
        
        int[] arr1 = {1,2,3,4,5};
       // System.out.println(array[4]);  // accessing array
       for(int i=0;i<5;i++){     // for(int i=0; i<arr1.length;i++) - if array size is unknown
         System.out.print(arr1[i] + " ");
        }*/


       /*  // Sum of all elements in array
         int sum=0;
         int[] array 2
         = new int[5];
         for(int i =0;i<array.length;i++){
            array[i] = num.nextInt();
            sum+=array[i];
         }
         System.out.println(sum); */


        /* // Maximum element in array
        int[] array = new int[5];
        for(int i =0;i<array.length;i++){
            array[i] = num.nextInt();
        }
        int max = array[0];
        for(int i =0; i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
            
        }
        System.out.println(max); */
        /*int[] array = new int[5];
        for(int i =0;i<array.length;i++){
            array[i] = num.nextInt();
        }
         //int even = array[0];
        for(int i =0; i<array.length;i++){
            if(array[i]%2 == 0){
                System.out.print(array[i]+" ");
            }
           
            
    }*/
   int sum=0;
        int[] array = new int[5];
        for(int i =0;i<array.length;i++){
            array[i] = num.nextInt();
        }

        for(int i =0; i<array.length;i++){
            if(array[i]%2 == 0 && array[i]%3 == 0){
               sum+=array[i];
            }
            
    }
    System.out.println(sum);
    
    }
}
