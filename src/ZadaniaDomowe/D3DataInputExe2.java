package ZadaniaDomowe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class D3DataInputExe2 {
    public static int[] sortedArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ile liczb wylosować? ");
        int value = scan.nextInt();
        int[] newTab = new int[value];

        Random generator = new Random();
        for (int i = 0; i < newTab.length; i++) {
            newTab[i] = generator.nextInt(100);

        }
        Arrays.sort(newTab);

        for (int sortedValue : newTab) {
            System.out.println(sortedValue);
        }
        return newTab;
    }
}
