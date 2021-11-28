public class Petla8 {
    public static void main(String[] args) {
        //definicja zmiennej z ilością rzędów i gwiazdek w wierszu
        int n = 5;

        //tworzymy pętlę która będzie generowała nam WIERSZE
        for (int i =1; i <= n; i++) {
            StringBuilder row = new StringBuilder();//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    StringBuilder append = row.append("* ");
                } else {
                    row.append(j).append(" ");
                }
            }
            System.out.print(row + "\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
        }
    }
}