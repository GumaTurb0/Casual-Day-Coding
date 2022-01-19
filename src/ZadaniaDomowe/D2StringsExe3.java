package ZadaniaDomowe;

public class D2StringsExe3 {
    public static void main(String[] args) {
        System.out.println("upperCase(\"abcdef\", 2) = " + upperCase("abcdef", 2));
        System.out.println("upperCase(\"z z z z z z\", 3) = " + upperCase("z z z z z z", 3));
    }


    public static String upperCase(String str, int index) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % index == 0) {
                builder.append(Character.toUpperCase(c));
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
