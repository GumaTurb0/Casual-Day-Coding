package ZadaniaDomoweSQL.inheritance;

public class SalariedEmployee extends pl.coderslab.oop.inheritance.Employee {

    public static final int MONTHLY_HOURS = 190;

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment() {
        return MONTHLY_HOURS * wage;
    }
}
