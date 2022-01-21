package ZadaniaDomoweJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D4FilesExe2 {
    public static void main(String[] args) {


        System.out.println(count("tekst 1"));
    }

    public static int count(String fileName) {

        int liczbaSłów = 0;
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                sb.append(scanner.next()).append("@@@");
            }
            String line = sb.toString();
            String[] słowo = line.split("@@@");

            for (String słowa : słowo) {
                liczbaSłów++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return liczbaSłów;
    }
}
