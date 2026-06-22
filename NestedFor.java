import java.util.Scanner;
public class NestedFor {
    public static void main(String[] args) {
       /*  for (int i = 1; i<=5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }*/
       Scanner sc = new Scanner(System.in);
       //char a = sc.nextLine().charAt(0);
       int b = sc.nextInt();
       /*for (int i = 1; i<=b; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*" + " ");
                //System.out.print(" ");
            }
            System.out.println(" ");
    } - square*/
   /*for (int i = 1; i<=b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
                //System.out.print(" ");
            }
            System.out.println(" ");
    } // Right triangle*/
     /*for (int i = 1; i<=b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                //System.out.print(" ");
            }
            System.out.println(" ");
    } - 1 12 123 1234 12345*/
   /*for (int i = 1; i<=b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                //System.out.print(" ");
            }
            System.out.println(" ");
    } // 1 22 333 4444 55555*/
     /*for (int i = b; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
                //System.out.print(" ");
            }
            System.out.println(" ");
    } // reverse right triangle*/
     /*for (int i = b; i>=1; i--) {               
            for (int j = 1; j <= i; j++) {      
                System.out.print(j + " ");      
                //System.out.print(" ");        
            }                                        
            System.out.println(" ");
    }*/
   /*for(int i=0; i<=b;i++){
    for(int j=1; j<=b-i;j++){
        System.out.print(j + " ");
    }
    System.out.println(" ");
   } //- rev right tri num*/
   /* for(int i=1; i<=b;i++){
    for(int j=1; j<=b-i+1;j++){
        System.out.print(j + " ");
    }
    System.out.println(" ");
   }  - rev right tri num*/
   /*for(int i=1;i<=b;i++){
    for(int j=1;j<=b-i;j++){   // space
        System.out.print(" ");    
    }
    for(int j=1;j<=(i*2-1);j++){   //star
        System.out.print("*");
   }
   System.out.println();

}*/
/*for(int i=1;i<=b;i++){
    for(int j=1;j<=b-i;j++){   // space
        System.out.print(" ");    
    }
    for(int j=1;j<=(i*2-1);j++){   //star
        System.out.print("*");
   }
   System.out.println();
} // triangle*/
for(int i=0;i<=b;i++){
    for(int j =1;j<=i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i*2-1;k++){
        System.out.print("*");
    }
    System.out.println();
}

}
}
