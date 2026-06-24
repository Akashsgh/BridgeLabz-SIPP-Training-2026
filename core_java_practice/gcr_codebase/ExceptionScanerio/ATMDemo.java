package core_java_practice.gcr_codebase.ExceptionScanerio;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(
            double balance,
            double requested) {

        super("Available Balance: ₹" + balance +
                ", Requested Amount: ₹" + requested);
    }
}

class ATMAccount {

    private double balance;

    public ATMAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    balance,
                    amount);
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful. Balance = ₹" + balance);
    }
}

public class ATMDemo {

    public static void main(String[] args) {

        ATMAccount account = new ATMAccount(5000);

        try {

            account.withdraw(8000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}