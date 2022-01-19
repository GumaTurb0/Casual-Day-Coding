package ZadaniaDomowe;

import java.util.Arrays;

public class D2MultiArrExe3 {
    public static void main(String[] args) {
        System.out.println("Arrays.toString(lessMore(new int[][]{{1,2,3,4},{1,2,3,4}})) = " + Arrays.toString(lessMore(new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}})));
        System.out.println("Arrays.toString(lessMore(new int[][]{{4,4,4,4},{4,4,4,4}})) = " + Arrays.toString(lessMore(new int[][]{{4, 4, 4, 4}, {4, 4, 4, 4}})));
    }


    public static int[] lessMore(int[][] arr) {
        int[] lessMore = new int[2];
        int sum = 0;
        int count = 0;
        for (int[] inner : arr) {
            for (int val : inner) {
                sum += val;
                count++;
            }
        }
        double avg = sum / (double) count;
        for (int[] inner : arr) {
            for (int val : inner) {
                if (val < avg) {
                    lessMore[0]++;
                } else if (val > avg) {
                    lessMore[1]++;
                }
            }
        }
        return lessMore;
    }

}
