package EgzaminPróbnyJava;

public class Zad4 {
    public static void main(String[] args) {
        int[] tablica;
        tablica = Methods.returnTab();
        //System.out.println(tablica);
        for (int i=0; i<tablica.length;i++){
            System.out.print(tablica[i] + " ");
        }
    }
}
