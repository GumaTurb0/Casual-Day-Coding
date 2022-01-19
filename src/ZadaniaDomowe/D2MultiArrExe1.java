package ZadaniaDomowe;

public class D2MultiArrExe1 {
    public static void main(String[] args) {
        System.out.println("oddSum(new int[][] {{ 7, 2, 3, 5} , { 5, 9, 1, 3}}) = " + oddSum(new int[][]{{ 7, 2, 3, 5} , { 5, 9, 1, 3}}));
    }


    public static int oddSum(int[][] arr) {
        int oddSum = 0;
        for (int[] inner : arr) {
            for (int i = 1; i < inner.length; i += 2) {
                oddSum += inner[i];
            }
        }
        return oddSum;
    }
}
