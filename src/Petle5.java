public class Petle5 {
    public static void main(String[] args) {
        int resultFor = 0;
        int resultWhile = 0;
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            resultFor += i;
        }
        System.out.print(resultFor);
        System.out.println();
        int j = 0;
        while (j<10) {
            j++;
            resultWhile += j;
        }
        System.out.println(resultWhile);
    }
}
//resultFor = i;
//for (int j = i; j < 10; j++) {