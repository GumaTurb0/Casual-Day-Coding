public class ClassCwiczenie1A {
    public static void main(String[] args) {
        int z = 1;
        while (z < 10) {
            z = z + 1;
            if (z > 3) {
                System.out.println("wielkie X");
            }
        }
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("Malutkie x" +
                        "");
            }
        }


            int a = 0;
            while (a < 4) {
                System.out.print("a");
                if (a < 1) {
                    System.out.print(" ");
                }
                System.out.print("n");
                if (a > 1) {
                    System.out.print("tyczny");
                    a = a + 2;
                }
                if (a == 1) {
                    System.out.print("talek");
                }
                if (a < 1) {
                    System.out.print("asz");
                }
                System.out.println("");
                a = a + 1;
            }
        }
}