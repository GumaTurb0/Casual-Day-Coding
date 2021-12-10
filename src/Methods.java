public class Methods {
    public static int multiply(int multiplier, int index) {
        int multiply = multiplier*index;
        return multiply;
    }
    public static double convertToUsd(double pln) {
        return pln / 4.04;
    }
    public static String createName(String name, String surename, String nickname) {
        return name + " "+nickname+ " " + surename;
    }
    public static double calculateNetto(double gross, double vat) {
        return gross * (1 - vat);
    }
    public static boolean checkMaturity(int age) {
        if (age> 18) {
            return true;
        }
        return false;
    }
    public static String checkEvenOdd(int number) {
        if (number  % 2 == 0) {
            return "even";
        }
        return "odd";
    }
    public static int maxOfThree(int num1, int num2, int num3){
        if ((num1>num2)&&(num1>num3)) {
            return num1;
        }else if ((num2>num1)&&(num2>num3)) {
            return num2;
        }else{
            return num3;
        }
        }
}
    /** napisz publiczną metodę maxOfThree,
     * która przyjmie trzy parametry liczbowe. Metoda ma zwrócić największą liczbę.
     * */