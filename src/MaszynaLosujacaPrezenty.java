import java.util.LinkedList;
import java.util.Random;

public class MaszynaLosujacaPrezenty {
    public static void main(String[] args) {
        int Kamil = 0;
        int Kasia = 1;
        int Irena=2;
        int Jan= 3;
        int Kajetan = 4;
        int Justyna = 5;
        LinkedList lista = new LinkedList();
        Random losowanko = new Random();
        for (int los =0; los < 5; los++ ){
            lista.add(losowanko.nextInt()*6);
        }
            System.out.println(lista.stream().count());
    }
}
