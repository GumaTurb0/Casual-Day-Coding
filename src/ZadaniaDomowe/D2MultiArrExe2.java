package ZadaniaDomowe;

import java.util.Arrays;

public class D2MultiArrExe2 {
    public static void main(String[] args) {
        System.out.println("Arrays.toString(minimum(new int[][]{{1,2,3,4},{4,3,2,1},{-5,3,5,-10}})) = " + Arrays.toString(minimum(new int[][]{{1, 2, 3, 4}, {4, 3, 2, 1}, {-5, 3, 5, -10}})));
    }


    public static int[] minimum(int[][] arr) {
        int[] mins = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int[] inner = arr[i];
            mins[i] = inner[0];
            for (int j = 1; j < inner.length; j++) {
                if (inner[j] < mins[i]) {
                    mins[i] = inner[j];
                }
            }
        }
        return mins;
    }

}
