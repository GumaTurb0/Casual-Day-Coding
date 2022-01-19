package ZadaniaDomowe;

public class D2StringsExe6 {
    public static void main(String[] args) {
        System.out.println("encode(\"abc\", 0) = " + encode("abc", 0));
        System.out.println("encode(\"abc\", 1) = " + encode("abc", 1));
        System.out.println("encode(\"klmnopqrstuvwxyzabcdefghij\", -10) = " + encode("abcdefghijklmnopqrstuvwxyz", -1));
    }

    public static String encode(String str, int shift) {
        char[] alphabet = new char['z' - 'a' + 1];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        shift = shift % alphabet.length;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int j = c - 'a';
            int k;
            if (shift >= 0) {
                k = (j + shift) % alphabet.length;
            } else {
                if (j - Math.abs(shift) >= 0) {
                    k = j - Math.abs(shift);
                } else {
                    k = alphabet.length + (j - Math.abs(shift));
                }
            }
            builder.append(alphabet[k]);
        }
        return builder.toString();
    }
}
