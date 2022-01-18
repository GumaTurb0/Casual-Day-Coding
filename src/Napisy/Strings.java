package Napisy;

public class Strings {
    public static int charPos(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}

