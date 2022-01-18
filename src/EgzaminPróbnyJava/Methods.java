package EgzaminPróbnyJava;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Methods {
    public static int rectangle(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static String shorten(String str, int lenght) {
        int długość = lenght;
        String text = str;
        String skrócony = str.substring(0, długość);
        return skrócony;
    }

    public static int[] div(int size, int interval) {
        Random r = new Random();
        int[] intArr = new int[size];
        int a = r.nextInt(interval) + 1;
        for (int i = 0; i < intArr.length; i++) {
            while (true) {
                intArr[i] = r.nextInt(interval) + 1;
                if ((intArr[i] % 2 == 0) && (intArr[i] % 3 != 0)) {
                    break;
                }
            }
        }
        return intArr;
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        int param;
        while (!scan.hasNextLine()) {
            System.out.println("Waiting for a number.");
            scan.next();
        }
        param = scan.nextInt();
        return param;
    }

    public static int[] returnTab() {
        System.out.println("Input size of array: ");
        int size = getInt();
        int[] intArr = new int[size];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }
        return intArr;
    }

    public static double sphere() {
        System.out.println("Program has calculate the volume of the sphere.");
        System.out.println("Please input radius as double value: ");
        double R = getInt();
        double sphere = (4 * Math.PI * R * R * R) / 3;
        System.out.print("Volume of the sphere is: ");
        System.out.printf("%2.2f.", sphere);
        System.out.print("");
        return sphere;
    }

    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replaceAll(forReplace, replacement);
    }

    public static int countNumbers(String str) {
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
            try {
                sum += Integer.parseInt(String.valueOf(charArr[i]));
            }catch(NumberFormatException e){

            }
        }
        return sum;
    }
}