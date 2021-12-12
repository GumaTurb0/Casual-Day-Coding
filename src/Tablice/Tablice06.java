package Tablice;

import java.util.Arrays;

public class Tablice06 {
    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] numbers2= {6, 5};

        int[] sum= new int[numbers2.length];

        for (int i=0; i< numbers.length; i++){
            sum[i]=numbers[i]+numbers2[i];
        }
        System.out.println("ArraysToStrin(numbers) = " + Arrays.toString(numbers));
        System.out.println("ArraysToString(numbers2) = " + Arrays.toString(numbers2));
        System.out.println("AraysToString(sum) = " + Arrays.toString(sum));
    }
}
