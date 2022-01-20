package ZadaniaDomowe;

import java.util.Scanner;

public class D3DataInputExe1 {
    public static void printTriangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wartość liczbową: ");


        while (!scan.hasNextInt()) {
            String wrongInput = scan.nextLine();
            System.out.println(wrongInput + "to błędna wartość");
        }
        int triangle = scan.nextInt();

        for (int i = 0; i < triangle; i++) {
            String row = ("");
            for (int j = 0; j < triangle; j++) {
                if (j<=i)
                    row += ("x");
            }
            System.out.print(row + "\n");
        }
    }
}
