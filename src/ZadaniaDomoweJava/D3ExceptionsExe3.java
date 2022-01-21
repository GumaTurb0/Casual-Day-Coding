package ZadaniaDomoweJava;

public class D3ExceptionsExe3 {
    public static void main(String[] args) {
        try {
            System.out.println(getLenght(null));
        } catch (NullPointerException e) {
            System.out.println("String jest nullem");
        }
    }

    public static int getLenght(String str) {
        int lengthOfStr = str.length();
        if (str == null) {
            throw new NullPointerException("Długość słowa to 0");
        }

        return lengthOfStr;
    }
}
