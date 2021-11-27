package example1;

public class Car {

    //Apibudiname STATE (busena), kaip automobilis atrodys.
    int yearCreated;
    double weight;
    int price;
    String brand;
    boolean isElectric; // pvz.: isOld. isNew, isSmart, shouldExplode

    //defaultinis/standartinis onstruktorius, kuris siaip buna nematomas.
    public Car() {
        System.out.println("Invoking Car constructor to build a Car");
    }

    public Car(int yearCreated, double weight, int price, String brand, boolean isElectric) {
        this.yearCreated = yearCreated;
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.isElectric = isElectric;
    }


    //Apibudiname BEHAVIOR (elgsena), kaip automobilis elgsis
    //void reiskia, kad metodas nieko negrazina, bet kazka daro
    void turnOnEngine() {
        System.out.println("Engine is ON...");
    }

    void move() {
        System.out.println("Car is moving...");
    }

    //sis metodas turi viena parametra
    void playSong(String songName) {
        System.out.println("Playing song " + songName + ".mp3");
    }

    int getYearCreated() {
        return yearCreated;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearCreated=" + yearCreated +
                ", weight=" + weight +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

}

