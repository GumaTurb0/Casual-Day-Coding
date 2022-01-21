package ZadaniaDomoweSQL.inheritance;

public class HourlyEmployee extends pl.coderslab.oop.inheritance.Employee {

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(int hours) {
        return hours * this.wage;
    }
}
