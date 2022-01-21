package ZadaniaDomoweSQL.attributes;

import ZadaniaDomoweSQL.attributes.AccessModifier;

public class Main01 {

    public static void main(String[] args) {
        AccessModifier test1 = new AccessModifier();
        test1.publicAttribute = 123;
        test1.protectedAttribute = -15;
//        has private access in AccessModifier
//        test1.privateAttribute = 90;

        AccessModifier test2 = new AccessModifier();
        test2.publicAttribute = -3;
        test2.protectedAttribute = 10101010;

        System.out.println("test1.publicAttribute: " + test1.publicAttribute);
        System.out.println("test2.publicAttribute: " + test2.publicAttribute);

        System.out.println("static: " + AccessModifier.całkiemBezużytecznePole);
        System.out.println("Hura!");


    }
}
