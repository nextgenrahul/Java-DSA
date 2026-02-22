public class BankAccount {
    // Private Fields : Hidden from direct access
    private String accountHolder;
    private double balance;
    private String accountNumber;
    private boolean isActive;

    // Constructor : Enforces valid initial state
    public BankAccount(String holder, String accNum, double initialDeposit) {
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Initial deposit cannot be negative");
        }
        this.accountHolder = holder;
        this.accountNumber = accNum;
        this.balance = initialDeposit;
        this.isActive = true;
    }

    // Public getter (read-only access)
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setAccountHolder(String newHolder) {
        if (newHolder == null || newHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty");
        }
        this.accountHolder = newHolder;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
    }

    @Override
    public String toString() {
        return "Account : {" +
                "\n holder='" + accountHolder + '\'' +
                ",\n balance=₹" + balance +
                ",\n number='" + accountNumber + '\'' +
                ",\n active=" + isActive +
                "\n}";
    }

}
