class BankAccount {
    String customerName;
    double balance;
    String accountType;

    // Instance Initializer Block
    {
        this.accountType = "Savings";
        System.out.println("Account Initialization Started");
    }

    // Default Constructor
    public BankAccount() {
        this("Unknown", 0.0);
    }

    // Constructor with name
    public BankAccount(String customerName) {
        this(customerName, 5000.0); // Matching the output example balance
    }

    // Constructor with name and balance
    public BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
        System.out.println("Customer: " + this.customerName);
        System.out.println("Balance: " + (int)this.balance);
    }

    public static void main(String[] args) {
        new BankAccount("Amit");
    }
}