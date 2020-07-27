public class Bank_Account {

    private String accountName ;
    private int accountNumber;
    private double accountBalance;

    public void deposit(double amount){
        accountBalance = accountBalance + amount;
        System.out.println("Account Balance after deposit = "+accountBalance);
     //   return accountBalance;
    }
    public void withdraw(double amount){
        accountBalance = accountBalance - amount;
        System.out.println("Account Balance after withdraw= "+accountBalance);
      //  return accountBalance;
    }
    public void display(){

        System.out.println("Account Balance = "+accountBalance+"For user "+ accountName +" of "+accountNumber+" account");
    }


    public Bank_Account(String accountName, int accountNumber, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
    }

}
