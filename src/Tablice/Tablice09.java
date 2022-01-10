package Tablice;

import java.util.Arrays;

public class Tablice09 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 9, 8, 6, 1, 2, 3, 4, 5, 99};
        int[] secNumbers = new int[] {9, 8, 11, 1, 5, 4, 6, 0, 1, 3};
        int[] sumTab = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            sumTab[i]= numbers[i] + secNumbers[i];
        }
        System.out.println("Arrays.toString(numbers)"+ Arrays.toString(numbers) + "\n" + "Arrays.toString(secNumbers)" + Arrays.toString(secNumbers));
        System.out.println("Arrays.toString(sumTab)" + Arrays.toString(sumTab));


    }
}

//stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
//stwórz drugą tablicę, nazwij ją secondNumbers, wypełnij 10 dowolnymi liczbami,
//stwórz trzecią tablicę zawierającą sumy elementów, które mają w tablicach pozycję o tym samym indeksie.