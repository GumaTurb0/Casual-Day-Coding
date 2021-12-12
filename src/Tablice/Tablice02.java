package Tablice;

import java.util.Random;

public class Tablice02 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] randNumbers = new int[20];
        for(int i=0; i< randNumbers.length;i++){
            randNumbers[i]= r.nextInt(101);
            System.out.println(randNumbers[i]+ " ");
        }

        int min = randNumbers[0];
        for (int i=0;i< randNumbers.length;i++){
            if(randNumbers[i] < min){
                min = randNumbers[i];
            }
        }
        System.out.println("min = " + min);
    }
}
/**przy użyciu pętli for stwórz tablicę o nazwie randNumbers, zawierającą 20 losowych liczb z zakresu 0-100
 * (do otrzymania losowej wartości użyj sposobu opisanego w snippetach),
 wypisz w konsoli minimalną wartość z tablicy.*/