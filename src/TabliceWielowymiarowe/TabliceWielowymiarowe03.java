package TabliceWielowymiarowe;

public class TabliceWielowymiarowe03 {
    public static void main(String[] args) {
        int[][] task3Array = {{2, 3, 4, 6}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < task3Array.length; i++) {
            for (int j = 0; j < task3Array[i].length; j++) {
                System.out.print(task3Array[i][j] + " ");
            }
        }
        System.out.println("\n");
        for (int[] arr : task3Array){
            for (int val : arr){
                sumA += val;
            }
        }
        System.out.println(sumA);

        for (int i = 0; i < task3Array.length ; i++){
            for (int j = 0; j < task3Array[i].length; j++){
                sumB += task3Array[i][j];
            }
        }
        System.out.println(sumB);
    }
}
            