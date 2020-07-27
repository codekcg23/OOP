public class Bank_Account_Main {

    public static void main(String[] args){
        Bank_Account ba1 = new Bank_Account("kavishka",1234,1200.00);
        ba1.deposit(120);
        ba1.withdraw(20);
        ba1.display();
    }
}
