package TabliceWielowymiarowe;

public class TabliceWielowymiarowe02 {
    public static void main(String[] args) {
        int[][] task2Array = {{2, 3, 4}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        for (int i = 0; i < task2Array.length; i++) {
            int[] innerTab = task2Array[i];
            System.out.println(innerTab.length);
        }
        for (int i=0; i< task2Array.length; i++){
            for (int j=0; j < task2Array[i].length ; j++){
                System.out.print(task2Array[i][j]+" ");
            }
        }
    }
}

//        wypisz długość tablic składających się na 2-gi wymiar,
//wypisz wszystkie elementy tablicy task2Array (musisz użyć do tego zagnieżdżonej pętli for).
