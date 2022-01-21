package ZadaniaDomoweSQL.advanced;

public class Main03 {

    public static void main(String[] args) {
        Product szynka = new Product("Szynka z kotła 100 g", 25.99);
        Product kalafior = new Product("Kalafior sztuka", 8.99);
        Product cukierasy = new Product("Cukierki Krówka 100 g", 34.99);

        ZadaniaDomoweSQL.advanced.ShoppingCart shoppingCart = new ZadaniaDomoweSQL.advanced.ShoppingCart();

        // Biorę szynkę
        shoppingCart.addProduct(szynka, 5);
        // Biorę kalafiory
        shoppingCart.addProduct(kalafior, 2);
        // Biorę cukierasy
        shoppingCart.addProduct(cukierasy, 2);
        // ... a tam więcej cukierasów
        shoppingCart.addProduct(cukierasy, 3);

        // Hmmm ....
        shoppingCart.printReceipt();

        // Nie chce kalafiora, bo szkoda kasy
        shoppingCart.removeProduct(kalafior);
        // ... najem się kilogramem cukierasów!
        shoppingCart.updateProduct(cukierasy, 10);

        shoppingCart.printReceipt();

        // Wrzuciłem do kosza jeszcze trochę szynki, ale sam wyciągnąłem
        // spod lady więc nie ma kodu
        Product someProduct = new Product("Szynka z kotła 100 g", 25.99);
        System.out.println(szynka.equals(someProduct));
        shoppingCart.addProduct(new Product("Szynka z kotła 100 g", 25.99), 1);
        shoppingCart.printReceipt();
    }
}
