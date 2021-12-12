package Tablice;

import java.util.Arrays;

public class Tablice04 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] reverse = new int[numbers.length];

        for (int i = 0, j = reverse.length - 1; i < numbers.length && j >= 0; i++, j--) {
            reverse[j] = numbers[i];
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(reverse) = " + Arrays.toString(reverse));
    }
}

/** stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
 stwórz zmienną tablicową reverse i umieść w niej elementy tablicy numbers w odwrotnej kolejności,
 wypisz na konsoli elementy z tablicy reverse.
 Dla tablicy o elementach:

 3, 5, 7, 2, 1

 otrzymamy wynik:

 1, 2, 7, 5, 3
 */
