package Tablice;

public class Tablice01 {
    public static void main(String[] args) {
        int[] numbers= new int[50];
        for (int i=0; i<50;i++){
            numbers[i] = i;
        }
        for (int i=0; i< numbers.length;i++){
            if (i != 0 && i  % 10==0){
                System.out.println();
            }
            if (numbers[i]<10){
                System.out.print("0");
            }
            System.out.print(numbers[i]+ ", ");
        }
    }
}
/** stwórz 50-elementową tablicę o nazwie mainTab z kolejnymi liczbami całkowitymi od 0 do 49,
 wypisz na konsoli po kolei elementy tej tablicy, po dziesięć w każdym wierszu,
 liczby jednocyfrowe uzupełnij dodatkowym zerem na początku (np. 03).
 00, 01, 02, 03, 04, 05, 06, 07, 08, 09,
 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
 30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
 */