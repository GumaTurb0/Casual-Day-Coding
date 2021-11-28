public class Tablice2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "berry"};
        System.out.println(fruits[0]);
        String lastFruit = fruits[fruits.length-1];
        System.out.println(lastFruit);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
