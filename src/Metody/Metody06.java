package Metody;

public class Metody06 {
    public static void main(String[] args) {
        boolean resoult;
        resoult = Methods.checkMaturity(18);
        if (resoult == true) {
            System.out.println("Jesteś pełnoletni");
        }else {
            System.out.println("Jesteś niepełnoletni.");
        }
    }
}
