package ZadaniaDomowe;

import java.util.Arrays;

public class D1TabExe3 {
    public static void main(String[] args) {
        System.out.println("Arrays.toString(returnUnique(new int[]{1,2,3,4,5})) = " + Arrays.toString(returnUnique(new int[]{1, 2, 3, 4, 5})));
        System.out.println("Arrays.toString(returnUnique(new int[]{1,1,1,1})) = " + Arrays.toString(returnUnique(new int[]{1, 1, 1, 1})));
        System.out.println("Arrays.toString(returnUnique(new int[]{-1,1,-1,1,0})) = " + Arrays.toString(returnUnique(new int[]{-1, 1, -1, 1, 0})));
    }

    public static int[] returnUnique(int[] arr) {
        int count = 0;
        int[] uniqueValues = new int[arr.length];
        for (int el : arr) {
            if (!contains(uniqueValues, count, el)) {
                uniqueValues[count] = el;
                count++;
            }
        }
        return Arrays.copyOf(uniqueValues, count);
    }

    public static boolean contains(int[] arr, int limit, int element) {
        for(int i = 0; i < limit && i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

}
