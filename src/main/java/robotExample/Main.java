package robotExample;

public class Main {
    public static void main(String[] args) {

        //ObjektoTipas objektoVardas = KlasesKonstruktorius();
        Robot robotJimmy = new Robot(); // Konstruktorius uskuria atmintyje object instance pagal duota blueprint/brezini
        robotJimmy.setName("Jimmy");
        robotJimmy.setPrice(500);
        robotJimmy.setSeriesNo(1);

        Addon goldenHelmet = new Addon(150, "golden_helmet");
        robotJimmy.setAddon(goldenHelmet);

        RobotFeature navigation = new RobotFeature("Google maps");
        RobotFeature spotify = new RobotFeature("Spotify");
        RobotFeature tinder = new RobotFeature("Tinder");
        RobotFeature [] jimmyFeatures = {navigation, spotify, tinder};
        robotJimmy.setRobotFeatures(jimmyFeatures);

        System.out.println(robotJimmy);
    }
}
