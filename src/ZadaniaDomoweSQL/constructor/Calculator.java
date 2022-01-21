package ZadaniaDomoweSQL.constructor;

import java.util.Arrays;

public class Calculator {


    private String[] operations;

    public Calculator() {
        operations = new String[0];
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        addOperation(String.format("%.2f added to %.2f got %.2f", num1, num2, result));
        return result;
    }

    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        addOperation(String.format("%.2f subtracted from %.2f got %.2f", num2, num1, result));
        return  result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        addOperation(String.format("%.2f multiply by %.2f got %.2f", num1, num2, result));
        return result;
    }

    public double divide(double num1, double num2) {
        double result = num1 / num2;
        addOperation(String.format("%.2f divide by %.2f got %.2f", num1, num2, result));
        return result;
    }

    protected void addOperation(String op) {
        operations = Arrays.copyOf(operations, operations.length + 1);
        operations[operations.length - 1] = op;
    }

    public void printOperations() {
        for (String op : operations) {
            System.out.println(op);
        }
    }

    public void clearOperations() {
        operations = new String[0];
    }

    public void addAndDivideAndPrint(double num1, double num2) {
        add(num1, num2);
        divide(num1, num2);
        printOperations();
    }
}
