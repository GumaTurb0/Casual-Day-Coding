import java.util.Scanner;

public class KalkulatorCzasu {
    public static void main(String[] args) {
        Scanner skanerCzasu = new Scanner(System.in);
        System.out.println("Podaj sekundy do konwersji: ");
        int h, m, s, sek, god;
        sek = skanerCzasu.nextInt();
        h= sek/3600;
        m=(sek%3600)/60;
        god=h;
        System.out.println(h+ "h" + m+"m");

        
    }
}
