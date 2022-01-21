package pl.coderslab.oop.constructor;

import ZadaniaDomoweSQL.constructor.Calculator;

public class Main02 {

    public static void main(String[] args) {
        //Najpierw kalkulator to sobie trzeba stworzyć...
        Calculator calc1 = new Calculator();

        //Umie dodawać
        double result = calc1.add(7, 10);
        // result == 17

        //Umie odejmować
        result = calc1.subtract(100, 50);
        // result == 50

        //Umie mnożyć
        result = calc1.multiply(5, 5.0);
        // result == 25

        //Umie dzielić!
        result = calc1.divide(3, 2);
        // result == 1.5

        calc1.printOperations();
        // Na konsoli pojawią się:
        // 7 added to 10 got 17
        // 50 subtract from 100 got 50
        // 5 multiply by 5 got 25
        // 3 divide by 2 got 1.5

        calc1.clearOperations();
        calc1.printOperations();
        // Na konsoli pojawi się:
        // NIC
    }
}
