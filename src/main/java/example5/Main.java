package example5;

public class Main {
    public static void main(String[] args) {

        //ObjektoTipas objektoVardas = KlasesKonstruktorius();
        Robot robotJimmy = new Robot(); // Konstruktorius uskuria atmintyje object instance pagal duota blueprint/brezini
        robotJimmy.setName("Jimmy");
        robotJimmy.setPrice(500);
        robotJimmy.setSeriesNo(1);

        Addon goldenHelmet = new Addon(150, "golden_helmet");
    }
}
