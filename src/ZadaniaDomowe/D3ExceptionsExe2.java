package ZadaniaDomowe;

public class D3ExceptionsExe2 {
    public static void main(String[] args) {
        try {
            String[] strTab = {"styczeń", "luty", "marzec"};
            System.out.println(safeGet(strTab, 6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }

    public static String safeGet(String[] strTab, int index) {
        String number = "abc";
        for (int i = 0; i < strTab.length; i++) {
            number = strTab[index];
        }
        return number;
    }
}
