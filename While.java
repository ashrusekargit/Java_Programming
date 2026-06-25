public class While {
    public static void main(String[] args) {
        int n = 123;
        /*while (i<=5) {
            System.out.println(i*5);
            i++;
        }*/

       /*int count = 0 ;
       while(n>0){
        n=n/10;
        count++;
       }
       System.out.println(count);  // no of digits*/
    // sum of digits

    int sum = 0;
    while(n>0){
        int digit=n%10;
        sum += digit;
        n/=10;
    }
    System.out.println(sum);
    }
}
