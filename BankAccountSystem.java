class BankAccount {
    static String bankName = "SBI";
    private final int accountNumber;
    private double balance;
    private String accountHolderName;

    private static int totalAccount= 0;

    public BankAccount(int accountNumber,double balance,String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccount++;
    }

    public void displayAccountDetails() {
        if(this instanceof BankAccount){
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Balance: " + this.balance);
        }
    }

    static void totalAccounts() {
        System.out.println(totalAccount);
    }
}

public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(101, 1000.0, "Siddharth");
        bankAccount1.displayAccountDetails();
    }
}
//Account Number: 101
//Bank Name: SBI
//Account Holder Name: Siddharth
//Account Balance: 1000.0
