package ZadaniaDomowe;

public class D1TabExe2 {
    public static void main(String[] args) {
        System.out.println("contains(new int[]{1,2,3,4}, 2) = " + contains(new int[]{1, 2, 3, 4}, 2));
        System.out.println("contains(new int[]{}, 5) = " + contains(new int[]{}, 5));
        System.out.println("contains(new int[]{-9,5,2,0,3,-3,12,3}, 3) = " + contains(new int[]{-9, 5, 2, 0, 3, -3, 12, 3}, 3));

    }

    public static boolean contains(int[] arr, int element) {
        for (int el : arr) {
            if (el == element) {
                return true;
            }
        }
        return false;
    }
}
