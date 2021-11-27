package accessModifiers2;

import accsessModifiers.AccessModifiersMain;

public class AccessModifiersMainDifferentPackage {

    public static void main(String[] args) {
       // AccessModifiersMain.sayHelloUsingDefault(); negaliu pasiekti package - private metodo kitame package
        AccessModifiersMain.sayHelloUsingPublic(); // pasiektas, nes nustatytas PUBLIC modifier
       // AccessModifiersMain.sayHelloUsingPrivate(); negaliu pasiekti kitu klasiu PRIVATE metodu

    }
}
