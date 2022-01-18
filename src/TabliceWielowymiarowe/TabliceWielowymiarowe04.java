package TabliceWielowymiarowe;

import java.util.Arrays;

public class TabliceWielowymiarowe04 {
    public static void main(String[] args) {
        int[][] task4Array = {
                {2,   3,  4,  6},
                {12, 32, 12, 11},
                {3,   2,  1,  4},
                {5,   1,  6,  7}};
        int sum = 0;

        for (int i = 0; i < task4Array.length; i++) {
            sum += task4Array[i][i];
        }

        System.out.println("sum = " + sum);
    }
}





//
        //reverse[j] = numbers[i];
//        for (int i = 0; i < numbers.length - 1; i++) {
//            reverse[reverse.length - 1 - i] = numbers[i];
//        }
//
//        int k = reverse.length - 1;
//        int l = 0;
//        while (k >= 0) {
//            reverse[k] = numbers[l];
//            k--;
//            l++;
//        }

        //System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        //System.out.println("Arrays.toString(reverse) = " + Arrays.toString(reverse));