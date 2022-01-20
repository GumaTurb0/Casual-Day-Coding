package ZadaniaDomowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class D4FilesExe1 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(count("zliczanie"));
    }

    public static int count(String fileName) {

        int liczbaZnaków = 0;
        char[] array;

        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                sb.append(scan.nextLine() + "\n");

            }
            String tekst = sb.toString();
            array = tekst.toCharArray();

            for (int i = 0; i < array.length; i++) {
                if (Character.isLetterOrDigit(array[i])) {
                    liczbaZnaków++;
                } else if (Character.isWhitespace(array[i])) {
                    liczbaZnaków += 0;
                } else {
                    liczbaZnaków++;
                }
            }


        } catch (IOException e) {
            System.out.println("Brak pliku");
        }
        return liczbaZnaków;
    }
}
