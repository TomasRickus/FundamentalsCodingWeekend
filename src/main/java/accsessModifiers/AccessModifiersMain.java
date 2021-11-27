package accsessModifiers;

public class AccessModifiersMain {

    public static void main(String[] args) {
        sayHelloUsingDefault();
        sayHelloUsingPublic();
        sayHelloUsingPrivate();
        sayHelloUsingProtected();

    }

    /**
    * There are 4 access modifiers. PUBLIC, PRIVATE, PROTECTED and DEFAULT (no keyword)
     */

    /**
     * DEFAULT
     *
     * Kai nepridedam jokio access modifiers Java automatiskai padarys kintamaji ar metoda default access.
     * Default == package-private modifier.
     */

    static void sayHelloUsingDefault(){
        System.out.println("Greetings with DEFAULT access!");
    }

    /**
     * PUBLIC
     *
     * Jeigu pridedam PUBLIC raktazodi (keyword) prie klases, metodo, lauko, (field) tada visas pasaulis gali ji matyti
     * Visos kitos klases, klases esancios kituose package gali pasiekti ir naudoti ta resursa
     * Tai yra "maziausiai saugus" access modifiers
     */

    public static void sayHelloUsingPublic() {
        System.out.println("Greetings with PUBLIC access!");
    }

    /**
     * PRIVATE
     *
     * Bet koks metodas, laukas, construktorius su PRIVATE keyword yra pasiekiemas tik IS TOS PACIOS KLASES!
     */

    private static void sayHelloUsingPrivate () {
        System.out.println("Greetings with PRIVATE access!");
    }

    /**
     * PROTECTED
     *
     * "Tarpinis" saugumo kontroliavimo variantas tarp Public ir Private.
     *
     * Jei laukas, metodas yra pazymetas PROTECTED  access modifiers tai mes ji galime pasiekti is to pacio
     * PACKAGE (kaip ir package-private access modifiers) ir papildomai VAIKINESE klasese,
     * kurios extendina tevine klase.
     *
     */
    protected static void sayHelloUsingProtected () {
        System.out.println("Greetings with PROTECTED access!");
    }
}
