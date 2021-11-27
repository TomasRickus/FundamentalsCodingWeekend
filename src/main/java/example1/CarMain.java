package example1;

import java.util.Arrays;

public class CarMain {

    public static void main(String[] args) {

        Car audi = new Car();
        audi.yearCreated = 2021;
        audi.brand = "Audi";
        audi.price = 15000;
        audi.weight = 1500.00;
        audi.isElectric = true;

        System.out.println(audi);

        audi.turnOnEngine();
        audi.move();
        audi.playSong("Juoda Orchideja");

        Car bmw = new Car(1998, 1400.5, 300, "BMW", false);
        System.out.println(bmw);

        //masyvai:
        int[] numbers = {5, 3, 6};
        String[] vardai = {"Rasa", "Paulina", "Andrius"};
        Car[] garazas = new Car[3];

        garazas[0] = audi;
        garazas[2] = bmw;

        System.out.println(Arrays.toString(garazas));
        System.out.println(Arrays.toString(vardai));

        for (int indeksas = 0; indeksas < numbers.length; indeksas++) {
            System.out.print(numbers[indeksas] + " ");
        }

        System.out.println();

        garazas[1] = new Car(2010, 1111, 50, "Ferrari", false);

        System.out.println();

        for (Car car : garazas) { //parasom iter ir automatiskai sugeneruoja
                //System.out.println(car.brand);
            car.turnOnEngine();
            car.playSong(car.brand);

        }
    }
}
