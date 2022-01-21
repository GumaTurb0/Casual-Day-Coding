package ZadaniaDomoweSQL.attributes;

import ZadaniaDomoweSQL.attributes.AccessModifier;

public class Main02 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = 1;
        testAttribute.protectedAttribute = 2;
        testAttribute.ileMamSów = 9;
//        testAttribute.privateAttribute = 1;

        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 9;
        array[3] = -1;

        System.out.println(array[2]);

        System.out.println("testAttribute = " + testAttribute);
        System.out.println("testAttribute.publicAttribute = " + testAttribute.publicAttribute);
        System.out.println("testAttribute.protectedAttribute = " + testAttribute.protectedAttribute);
        System.out.println("testAttribute.ileMamSów = " + testAttribute.ileMamSów);
    }
}
