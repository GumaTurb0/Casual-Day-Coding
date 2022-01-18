package Tablice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Tablice08 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 9, 8, 6, 1, 2, 3, 4, 5, 99};

        System.out.println("Arrays.toString(numbers)" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers)" + Arrays.toString(numbers));
        Arrays.parallelSort(numbers);
        System.out.println("Arrays.toString(numbers)" + Arrays.toString(numbers));

    }
}

//stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
//posortuj rosnąco tablicę wykorzystując metody klasy Arrays,
//wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy Arrays.
