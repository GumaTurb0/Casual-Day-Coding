package ZadaniaDomowe;

public class D2StringsExe4 {
    public static void main(String[] args) {
        System.out.println("tripple(\"qazbbbwsx\") = " + tripple("qazbbbwsx"));
        System.out.println("tripple(\"aaawsxbbb\") = " + tripple("aaawsxbbb"));
        System.out.println("tripple(\"aaaabaaaa\") = " + tripple("aaaabaaaa"));
        System.out.println("tripple(\"11111\") = " + tripple("11111"));
    }

    public static int tripple(String str) {
        if (str.length() < 3) return 0;

        int count = 0;
        char prevprev = str.charAt(0);
        char prev = str.charAt(1);
        for (int i = 2; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == prev && prev == prevprev) {
                count++;
            }
            prevprev = prev;
            prev = c;
        }
        return count;
    }
}
