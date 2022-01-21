package ZadaniaDomoweSQL.oop.first;

public class BankAccount {

    private int number;
    private double cash = 0;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void depositCash(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Cannot deposit amount less than or equal to 0");
        }
        cash += amount;
    }

    public double withdrawCash(double amount) {
        if (amount <= 0) {
            throw  new IllegalArgumentException("Cannot withdraw amount less than or equal to 0");
        }
        double toWithdraw = Math.min(cash, amount);
        cash -= Math.min(cash, amount);
        return toWithdraw;
    }

    public String getInfo() {
        return String.format("%16d : %9.2f", number, cash);
    }
}
