package Tablice;

import java.util.Arrays;

public class Tablice03 {
    public static void main(String[] args) {
        int[] tab = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+ " ");
        }
        Arrays.fill(tab,2);
        System.out.println(Arrays.toString(tab));
    }
}

/** stwórz 10-elementową tablicę wypełnioną pojedynczą wartością "2". Tablica powinna wyglądać następująco:
 [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]

 zadanie wykonaj bez użycia pętli for.*/
