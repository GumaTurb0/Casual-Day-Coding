package ZadaniaDomoweSQL.oop.first;

public class Main01 {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456789);
        BankAccount account2 = new BankAccount(987654321);
        double balance = 1000.0;

        balance -= 300.0;
        account1.depositCash(300.0);

        balance -= 250.0;
        account2.depositCash(250.0);

        balance -= 450.0;
        account1.depositCash(450.0);

        System.out.printf("Balance: %.2f, account1: %.2f, account2: %.2f%n", balance, account1.getCash(), account2.getCash());

        balance = account1.withdrawCash(250.0);
        account2.depositCash(balance);

        balance = account2.withdrawCash(5000.0);
        account1.depositCash(balance);

        System.out.printf("account1: %.2f, account2: %.2f%n", account1.getCash(), account2.getCash());
        System.out.println("Account1: " + account1.getInfo());
        System.out.println("Account2: " + account2.getInfo());
    }
}
