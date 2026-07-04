class Bank{ 
    private String name;
    private int balance;
    Bank(String name, int balance){
        this.name=name;
        this.balance=balance;
    }//getters method--dont change the values
    public String getName(){
        return name;
    }
    public int getbalance(){
        return balance;
    }

//setters method --change the value
public void deposit(int amount){
    if (amount>0){
      balance+=amount;
    }
}
public void withdraw(int amount){
   if(balance !=0 && amount<balance){
       balance-= amount;
   }
    
}
}

public class Encapsulation {
    public static void main(String[] args) {
       Bank b=new Bank("customer1",0);
       System.out.println(b.getName()+" "+b.getbalance());
       b.deposit(1000);
       b.withdraw(500);
       System.out.println(b.getName()+" "+b.getbalance());
        
    }
}
