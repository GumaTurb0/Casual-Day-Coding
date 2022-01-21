package pl.coderslab.oop.methods;

import ZadaniaDomoweSQL.methods.Car;

public class Main05 {

    public static void main(String[] args) {
        Car skoda = new Car();
        skoda.setBrand("Skoda");
        skoda.setModel("Octavia");
        skoda.setPrice(120_000.00);

        String str = skoda.toString();
        System.out.println(str);
        System.out.println(str.toUpperCase());

        System.out.println(skoda);

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("abc");

//        Book b = new Book();
//        b.mainAuthor.firstName = "Olaf";
//
//        b.getMainAuthor().setFistName("Olaf");
//
//        b.getMainAuthor().getAddress().getCity().setName("Wrocław");
//        Author mainAuthor = b.getMainAuthor();
//        Address mainAuthorAddress = mainAuthor.getAddress();
//        City mainAuthorAddressCity = mainAuthorAddress.getCity();
//        String cityName = mainAuthorAddressCity.getName();
    }
}
