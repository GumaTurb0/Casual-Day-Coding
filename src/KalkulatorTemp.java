import java.util.Scanner;
public class KalkulatorTemp {

    public static void main(String[] args) {
        Scanner javaCzyta = new Scanner(System.in);
        double F, remaider, C, przelicznik;
        //Poproś użytkownika o podanie temp
        System.out.println("Podaj temperaturę w stopniach Celsjusza: ");
        C = javaCzyta.nextDouble();
        F= (C * 1.8) +32;
        System.out.printf("%.1f C = %.1f F\n", C, F);
    }
}
