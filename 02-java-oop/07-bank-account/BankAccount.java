import java.util.Random;

public class BankAccount{
    
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double accountBalance = 0;

    private static String createNumber(){
        String id = "";
        Random accountId = new Random();
        for(int i=0; i<10; i++){
            id += accountId.nextInt(10); 
        }
        return id;
    }

    public BankAccount (){
        numberOfAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = BankAccount.createNumber();
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void deposit(double amount, String account){
        if(account.equals("savings")){
            this.savingsBalance += amount;
        }
        else if(account.equals("checking")){
            this.checkingBalance += amount;
        }
        BankAccount.accountBalance += amount;
    }

    public void withdraw(double amount, String account){
        if(account.equals("savings")){
            if(this.savingsBalance < amount){
                System.out.println("Insufficient Funds!");
            }
            else{
                this.savingsBalance -= amount;
            }
        }
        else if(account.equals("checking")){
            if(this.checkingBalance < amount){
                System.out.println("Insufficient Funds!");
            }
            else{
                this.checkingBalance -= amount;
            }
        }
        BankAccount.accountBalance -= amount;
    }

    public void totalFunds(){
    System.out.println("Account Number: " + this.accountNumber + " | Checking Account: " + this.checkingBalance + " | Savings Balance: " + this.savingsBalance);
        double total = this.checkingBalance + this.savingsBalance;
        System.out.println("Total funds: " + total);
    }
}