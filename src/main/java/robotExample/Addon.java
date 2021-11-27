package robotExample;

/**
 * Brezinys atvaizduojantis papildini - Addon
 */

public class Addon {

    private int price;
    private String name;

    //Alt+insert
    public Addon(int price, String name) {
        this.price = price;
        this.name = name;
    }
    // Accesoriusnuo zodzio access - pasiekti
    public int getPrice() {
        return price;
    }
    //Mutatorius nuo zodzio mutate - mutuoti/pakeisti reiksme
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Addon{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
