package EgzaminPróbnyJava;

public class Zad3 {
    public static void main(String[] args) {
        int[] tablica;
        tablica = Methods.div(4, 20);

        for (int i=0; i <tablica.length;i++){
            System.out.print(tablica[i] + " ");
        }
    }
}


//W pliku Main03.java umieść metodę o sygnaturze public static int[] div(int size,
// int interval).
//
//Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu [1 - interval].
//Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
//Ilość elementów w tablicy ma być równa parametrowi size.
//Tablica nie może zawierać pustych elementów. (pamiętaj że
// domyślna wartość w tablicy dla typu int to 0)