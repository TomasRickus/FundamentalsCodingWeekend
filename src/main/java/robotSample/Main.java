package robotSample;

public class Main {
    public static void main(String[] args) {

        //ObjektoTipas objektoVardas = KlasesKonstruktorius();
        Robot robotJimmy = new Robot(); // Konstruktorius sukuria atmintyje object instance pagal duota blueprint/brezini
        robotJimmy.setName("Jimmy");
        robotJimmy.setPrice(500);
        robotJimmy.setSeriesNo(1);

        Addon goldenHelmet = new Addon(150, "golden_helmet");
        robotJimmy.setAddon(goldenHelmet);

        RobotFeature navigation = new RobotFeature("Google maps");
        RobotFeature spotify = new RobotFeature("Spotify");
        RobotFeature tinder = new RobotFeature("Tinder");
        RobotFeature[] jimmyFeatures = {navigation, spotify, tinder};
        robotJimmy.setRobotFeatures(jimmyFeatures);

        Robot robotBilly = new Robot();
        robotBilly.setName("Billy");
        robotBilly.setPrice(1000);
        robotBilly.setSeriesNo(2);

        robotBilly.setAddon(goldenHelmet);

        RobotFeature youtube = new RobotFeature("Youtube");
        RobotFeature[] billyFeatures = {navigation, youtube};
        robotBilly.setRobotFeatures(billyFeatures);

        System.out.println(robotJimmy);
        System.out.println();
        System.out.println(robotBilly);
    }
}
