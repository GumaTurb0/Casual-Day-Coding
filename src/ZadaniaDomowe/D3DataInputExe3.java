package ZadaniaDomowe;

import java.util.Scanner;

public class D3DataInputExe3 {
    public static void main(String[] args) {


    }

    public static String[] retirement() {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String newTab2[];
        while (true) {
            System.out.println("Podaj swoje dane w postaci: Nazwisko, Imię, Rok Urodzenia, Płeć: ");
            String dane = scanner.nextLine();
            if (dane.equals("quit")) {
                break;
            }
            int actualYear = 2021;
            String[] pojedynczeDane = dane.split(", ");
            int wiek = Integer.parseInt(pojedynczeDane[2]);
            if ((pojedynczeDane[3].equals("M")) && (actualYear - wiek > 64)) {
                sb.append(pojedynczeDane[0]).append(pojedynczeDane[1]).append(pojedynczeDane[2]).append(pojedynczeDane[3]);
            } else if ((pojedynczeDane[3].equals("K")) && (actualYear - wiek > 59)) {
                sb.append(pojedynczeDane[0]).append(pojedynczeDane[1]).append(pojedynczeDane[2]).append(pojedynczeDane[3]);
            }

        }
        return retirement();
    }
}

