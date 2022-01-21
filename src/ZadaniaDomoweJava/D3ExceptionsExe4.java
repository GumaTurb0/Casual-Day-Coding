package ZadaniaDomoweJava;

public class D3ExceptionsExe4 {
    public static void main(String[] args) {
        try {
            System.out.println(toInt("abc"));
        } catch (NullPointerException e) {
            System.out.println("Napis nie może być nullem");
        } catch (NumberFormatException e) {
            System.out.println("Napis nie jest liczbą");
        }

    }

    public static int toInt(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        int strToInt = Integer.parseInt(str);

        return strToInt;
    }
}
