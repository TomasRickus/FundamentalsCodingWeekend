package accsessModifiers;

public class AccessModifiersSamePackage {
    public static void main(String[] args) {
        AccessModifiersMain.sayHelloUsingDefault(); // pasiektas per package-private modifier. Nes tas pats package
        AccessModifiersMain.sayHelloUsingPublic(); // pasiektas per public modifier
       // AccessModifiersMain.sayHelloUsingPrivate(); negaliu pasiekti kitos klases PRIVATE modifier
    }
}
