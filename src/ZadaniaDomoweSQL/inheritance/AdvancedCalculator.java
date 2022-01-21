package ZadaniaDomoweSQL.inheritance;

import ZadaniaDomoweSQL.constructor.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

    public static final double PI = 3.14159265;

    private static String[] globalOperations = new String[0];

    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        String op = String.format("%.2f ^ %.2f got %.2f", num1, num2, result);
        addOperation(op);
        addGlobalOperation(op);
        return result;
    }

    public double root(double num1, double num2) {
        double result = Math.pow(num1, 1 / num2);
        String op = String.format("root %.2f from %.2f got %.2f", num2, num1, result);
        addOperation(op);
        addGlobalOperation(op);
        return result;
    }

    public static double computeCircleArea(double r) {
        // cannot call non-static array from here
        return PI * Math.pow(r, 2);
    }

    public static void printGlobalOperations() {
        for (String operation : globalOperations) {
            System.out.println(operation);
        }
    }

    public static void printGlobalOperations(int length) {
        for (int i = length; i > 0 ; i--) {
            System.out.println(globalOperations[globalOperations.length - i]);
        }

//        for (int i = 0; i < length ; i++) {
//            System.out.println(globalOperations[globalOperations.length - (length - i)]);
//        }
    }

    public static void printGlobalOperations(String length) {
        printGlobalOperations(Integer.parseInt(length));
    }

    private static void addGlobalOperation(String op) {
        globalOperations = Arrays.copyOf(globalOperations, globalOperations.length + 1);
        globalOperations[globalOperations.length - 1] = op;
    }
}
