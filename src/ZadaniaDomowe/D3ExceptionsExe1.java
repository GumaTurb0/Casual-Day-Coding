package ZadaniaDomowe;

public class D3ExceptionsExe1 {
    public static void main(String[] args) {
        try {
            average("12", "0");
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0!");
        } finally {
            System.out.println("Gdzie jest pies");
        }
    }

    public static void average(String a, String b) {
        int num = Integer.parseInt(a);
        int num1 = Integer.parseInt(b);
        int divide = num / num1;
        if (num1 == 0) {
            throw new ArithmeticException();
        }
    }
}
