package ZadaniaDomoweJava;

public class D2StringsExe1 {
    public static void main(String[] args) {
        System.out.println("replaceChar(\"abc\", 'b', 'z') = " + replaceChar("abc", 'b', 'z'));
        System.out.println("replaceChar(\"a a a a\", ' ', '-') = " + replaceChar("a a a a", ' ', '-'));
        System.out.println("replaceChar(\"a b c d e\", ' ', '\\0') = " + replaceChar("a b c d e", ' ', '\0'));
    }


    public static String replaceChar(String str, char forReplace, char replacement) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == forReplace) {
                builder.append(replacement);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}
