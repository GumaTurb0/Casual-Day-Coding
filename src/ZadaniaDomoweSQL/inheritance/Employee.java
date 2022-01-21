package pl.coderslab.oop.inheritance;

public class Employee {

    public int id;
    public String firstName;
    public String lastName;
    public double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public void raiseWage(int percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Percent must be greater than or equal 0");
        }
        wage = wage + wage * (100. / percent);
    }
}
