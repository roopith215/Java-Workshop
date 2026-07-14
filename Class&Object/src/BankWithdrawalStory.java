class BankAccount {
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    // Setters
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }

    // Processing via Getter Logic
    public double getRemainingBalance() {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }
}

public class  BankWithdrawalStory {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Rohan");
        account.setBalance(5000.0);
        account.setWithdrawAmount(1500.0);

        System.out.println("Remaining Balance: ₹" + account.getRemainingBalance());
    }
}