package ZadaniaDomoweSQL.advanced;

import ZadaniaDomoweSQL.advanced.CartItem;

import java.util.Arrays;

public class ShoppingCart {

    private CartItem[] cartItems;

    public ShoppingCart() {
        cartItems = new CartItem[0];
    }

    public void addProduct(Product product, int quantity) {
        int index = find(product);
        if (index < 0) {
            addCartItem(new CartItem(product, quantity));
        }
        else {
            int newQuantity = cartItems[index].getQuantity() + quantity;
            cartItems[index].setQuantity(newQuantity);
        }
    }

    public void removeProduct(Product product) {
        int index = find(product);
        if (index >= 0) {
//            "nullowanie"/"czyszczenie" elementu - NIE!
//            cartItems[index] = null;

//            Usuwanie bez zachowania kolejności
//            cartItems[index] = cartItems[cartItems.length - 1];
//            Usuwanie z zachowaniem kolejności
            for (int i = index; i < cartItems.length - 1; i++) {
                cartItems[i] = cartItems[i + 1];
            }
            cartItems = Arrays.copyOf(cartItems, cartItems.length - 1);
        }
    }

    public void updateProduct(Product product, int quantity) {
        int index = find(product);
        if (index >= 0) {
            cartItems[index].setQuantity(quantity);
        }
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (CartItem item : cartItems) {
            totalQuantity += item.getQuantity();
        }
        return totalQuantity;
    }

    public double getTotalSum() {
        double totalSum = 0;
        for (CartItem item : cartItems) {
            totalSum += item.getTotalPrice();
        }
        return totalSum;
    }

    public void printReceipt() {
        for (int i = 0; i < cartItems.length; i++) {
            CartItem item = cartItems[i];
            int lp = i + 1;
            String name = item.getProduct().getName();
            int id = item.getProduct().getId();
            int quantity = item.getQuantity();
            double price = item.getProduct().getPrice();
            double totalPrice = item.getTotalPrice();
            System.out.printf("%d. %s %d, %d x %.2f = %.2f%n",
                    lp, name, id, quantity, price, totalPrice);
        }
        System.out.println("---");
        System.out.printf("Razem: %.2f%n", getTotalSum());
    }

    private int find(Product product) {
        for (int i = 0; i < cartItems.length; i++) {
//            if (cartItems[i].getProduct().getId() == product.getId())

            if(cartItems[i].getProduct().getName().equals(product.getName()) &&
            cartItems[i].getProduct().getPrice() == product.getPrice())

            if (cartItems[i].getProduct().equals(product)) {
                return i;
            }
        }
        return -1;
    }

    private void addCartItem(CartItem cartItem) {
        cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
        cartItems[cartItems.length - 1] = cartItem;
    }
}
