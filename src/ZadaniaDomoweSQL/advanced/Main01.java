package ZadaniaDomoweSQL.advanced;

import pl.coderslab.oop.inheritance.AdvancedCalculator;

public class Main01 {

    public static void main(String[] args) {
        AdvancedCalculator advCalc1 = new AdvancedCalculator();
        AdvancedCalculator advCalc2 = new AdvancedCalculator();

        advCalc1.pow(2, 3);
        advCalc1.pow(2,2);
        advCalc2.root(125, 3);
        advCalc2.root(25, 2);
        advCalc2.root(4, 2);

        AdvancedCalculator.printGlobalOperations("3");
    }
}
