package Oops_Single;

abstract class Bank {
    private int Account_number;
    private double Balance;

    public int getAccount_number() {
        return Account_number;
    }

    public void setAccount_number(int Account_number) {
        this.Account_number = Account_number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance){
        this.Balance=Balance;
    }


    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}

   class Customer extends Bank{
       private String Customer_name;


       Customer( String Customer_name, int Account_number, double Balance){
           this.Customer_name=Customer_name;
           setAccount_number(Account_number);
           setBalance(Balance);
       }

       public String getCustomer_name(){
           return Customer_name;
       }
       @Override
       public void deposit(double amount) {
           setBalance(getBalance()+amount);
           System.out.println("New Balance: "+getBalance());
       }

       @Override
       public void withdraw(double amount) {
           if(amount<= getBalance()) {
               setBalance(getBalance() - amount);
               System.out.println("New Balance: " + getBalance());
           }else {
               System.out.println("Empty");
           }
       }
   }
   public class Bank_Details {

       public static void main(String[] args) {
           Customer cc = new Customer("Devendra",45575754,1000.1);

           System.out.println("Customer Name "+cc.getCustomer_name());
           System.out.println("Account Number "+cc.getAccount_number());

           cc.deposit(200);
           cc.withdraw(100);
           cc.withdraw(1200);
       }
    
}
