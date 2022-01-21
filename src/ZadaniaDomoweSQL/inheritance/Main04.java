package pl.coderslab.oop.inheritance;

import ZadaniaDomoweSQL.inheritance.HourlyEmployee;

public class Main04 {

    public static void main(String[] args) {
        pl.coderslab.oop.inheritance.Employee emp1 = new pl.coderslab.oop.inheritance.Employee(1, "Jan", "Kowalski", 10.00);
        pl.coderslab.oop.inheritance.Employee emp2 = new pl.coderslab.oop.inheritance.Employee(2, "Zofia", "Litwińska", 25.00);

        emp1.raiseWage(50);
//        emp2.raiseWage(-10);
        emp2.raiseWage(100);

        HourlyEmployee hEmp1 = new HourlyEmployee(3, "Wojchech", "Janin", 60.0);
        hEmp1.raiseWage(5);
        double payment = hEmp1.calculatePayment(160);
        System.out.println("payment = " + payment);

        pl.coderslab.oop.inheritance.SalariedEmployee sEmp1 = new pl.coderslab.oop.inheritance.SalariedEmployee(4, "Zbigniew", "Rycina", 50);
        sEmp1.raiseWage(1);
        payment = sEmp1.calculatePayment();
        System.out.println("payment = " + payment);
    }
}
