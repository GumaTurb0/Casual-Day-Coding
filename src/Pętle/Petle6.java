package Pętle;

public class Petle6 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            if (i %2 ==0) {
                System.out.println(i + "- parzysta");
            } else {
                System.out.println(i + "- nieparzysta");
            }
        }
        int j=0;
        while (j <=n){
            if (j%2 ==0){
                System.out.println( j + "- parzysta");
            }else{
                System.out.println(j + "- nieparzysta");
            }
            j++;
        }
    }
}
