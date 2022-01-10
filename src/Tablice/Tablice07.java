package Tablice;

public class Tablice07 {
    public static void main(String[] args) {
        int[] numbers =new int[] {9, 8, 11, 1, 5, 4, 6, 0, 1, 3};
        int[] revers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++)
            revers[i] = numbers[numbers.length-1 -i];
        for (int i = 0; i < revers.length; i++) {
            System.out.print(revers[i] + " ");
        }

    }
}


//stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
//stwórz zmienną tablicową reverse i umieść w niej elementy tablicy numbers w odwrotnej kolejności,
//wypisz na konsoli elementy z tablicy reverse.
