package ZadaniaDomoweJava;

public class Methods {
    public static double dogAge(double dogAge) {
        double age = dogAge;
        if (age < 2) {
            age = age * 10.5;
        } else {
            age = (2.0 * 10.5) + ((age - 2.0) * 4.0);
        }
        return age;
    }

    public static boolean divisibleBy(int a, int b) {
        return a % b ==0;
    }
    public static int[] append(int[] arr) {
        int[] result = new int[arr.length * 2];
        int i;
        for(i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        for(int j = arr.length - 1; j >= 0; j--, i++) {
            result[i] = arr[j];
        }
        return result;
    }
}

