package ZadaniaDomoweJava;

import java.io.File;
import java.util.Scanner;

public class D4FilesExe3 {
    public static void main(String[] args) {

        checkFileExist();

    }

    public static boolean checkFileExist() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String fileName = scanner1.nextLine();

        File file = new File(fileName);

        if (!(file.exists())) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        return true;
    }
}
