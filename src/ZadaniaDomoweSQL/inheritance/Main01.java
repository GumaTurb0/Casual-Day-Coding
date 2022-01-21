package pl.coderslab.oop.inheritance;

import ZadaniaDomoweSQL.inheritance.AdvancedCalculator;
import ZadaniaDomoweSQL.constructor.Calculator;

public class Main01 {

    public static void main(String[] args) {
        AdvancedCalculator advCalc = new AdvancedCalculator();
        advCalc.add(1,1);
        advCalc.multiply(5,5.15);
        advCalc.printOperations();

        advCalc.pow(4.5, 5);
        advCalc.divide(5, 2);
        advCalc.root(16, 2);
        advCalc.printOperations();

        Calculator calc = new Calculator();
        calc.addAndDivideAndPrint(2, 3);
//        addAndDivideAndPrint(calc, 2, 3);

        advCalc.clearOperations();
        advCalc.addAndDivideAndPrint(5, 6);
//        addAndDivideAndPrint(advCalc, 5, 6);
    }

    public static void addAndDivideAndPrint(Calculator calculator, double num1, double num2) {
        calculator.add(num1, num2);
        calculator.divide(num1, num2);
        calculator.printOperations();
    }
}
