public class BankAccountTest{
    public static void main(String[] args){
        BankAccount test = new BankAccount();

        System.out.println(test.numberOfAccounts);
        test.deposit(100, "checking");
        test.totalFunds();
        test.withdraw(101, "checking");
        test.totalFunds();
        test.withdraw(99, "checking");
        test.totalFunds();
        test.deposit(100, "savings");
        test.totalFunds();
        test.withdraw(101, "savings");
        test.totalFunds();
        test.withdraw(99, "savings");
        test.totalFunds();

    }
}