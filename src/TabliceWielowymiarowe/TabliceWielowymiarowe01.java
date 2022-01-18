package TabliceWielowymiarowe;

public class TabliceWielowymiarowe01 {
    public static void main(String[] args) {
        int[][] task1Array = {{2, 3, 4}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        System.out.println("Element w trzeciej kolumnie i drugim wierszu: " + task1Array[1][2]);
        System.out.println("Długość tablicy w drugim wierszu to: " + task1Array[1].length);
        System.out.println("element znajdujący się w 4 kolumnie i 3 wierszu: " + task1Array[2][3]);

        //Podpunkt 2 inne rozwiazanie
        int[] secondElement = task1Array[1];
        System.out.println("secondElement.length = " + secondElement.length);

        for (int i = 0; i < task1Array.length; i++) {
            int[] innerArray = task1Array[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(innerArray[j]+ " ");
            }
        }
    }
}

//
//wypisz
//
//oczekiwana wartość to 4