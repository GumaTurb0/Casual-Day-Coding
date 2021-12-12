package Tablice;

import java.util.Arrays;

public class Tablice05 {
    public static void main(String[] args) {
        int[] numbers = {1, 22, 333, 44, 5, 66, 777, 88, 9, 0};
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        


    }
}
/** stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
 posortuj rosnąco tablicę wykorzystując metody klasy Arrays,
 wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy Arrays.
*/
