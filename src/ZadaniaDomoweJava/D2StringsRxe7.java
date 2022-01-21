package ZadaniaDomoweJava;

public class D2StringsRxe7 {
    public static void main(String[] args) {
        System.out.println("censor(\"abc def ghi jkl\", new String[] {\"abc\", \"ghi\"}) = " + censor("abc def ghi jkl", new String[]{"abc", "ghi"}));
        System.out.println("censor(\"abc def ghi jkl\", new String[]{\"bc\", \"hi\"}) = " + censor("abc def ghi jkl", new String[]{"bc", "hi"}));
    }

    public static String censor(String str, String[] words) {
        StringBuilder builder = new StringBuilder();
        String[] tokens = str.split(" ");
        for (String token : tokens) {
            if (contains(words, token)) {
                builder.append("****").append(" ");
            } else {
                builder.append(token).append(" ");
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public static boolean contains(String[] words, String str) {
        for (String word : words) {
            if (word.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
