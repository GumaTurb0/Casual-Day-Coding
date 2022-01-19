package ZadaniaDomowe;

public class D2StringsExe2 {
    public static void main(String[] args) {
        System.out.println("replaceStr(\"ab-ab-ab-ab\", \"ab\", \"ba\") = " + replaceStr("ab-ab-ab-ab", "ab", "ba"));
        System.out.println("replaceStr(\"ab-ab-ab-ab\", \"ab\", \"xxx\") = " + replaceStr("ab-ab-ab-ab", "ab", "xxx"));
        System.out.println("replaceStr(\"abcabcabc\", \"z\", \"xyz\") = " + replaceStr("abcabcabc", "z", "xyz"));
        System.out.println("replaceStr(\"Ala ma kota, a kot ma Alę\", \" \", \" :) \") = " + replaceStr("Ala ma kota, a kot ma Alę", " ", " :) "));
    }


    public static String replaceStr(String str, String forReplace, String replacement) {
        StringBuilder builder = new StringBuilder();
        char forReplaceFirstChar = forReplace.charAt(0);
        for (int i = 0; i < str.length(); ) {
            char c = str.charAt(i);
            if (c == forReplaceFirstChar) {
                if (str.startsWith(forReplace, i)) {
                    builder.append(replacement);
                    i += forReplace.length();
                }
            } else {
                builder.append(c);
                i++;
            }
        }
        return builder.toString();
    }
}
