public class Methods {
    //public int sum(int num1, int num2){
      //  return num1+num2;
    //}
    //public static int sub(int num1,int num2){
      //  return num2-num1;
    //}


    // even num
    public static boolean isEven(int a){
        return a%2==0?true:false;
    }
    public static void main(String[] args) {
        Methods num = new Methods();
       // System.out.println(num.sum(10,20));
        //System.out.println(sub(20,39));
        System.out.println(isEven(4));
    }
}
