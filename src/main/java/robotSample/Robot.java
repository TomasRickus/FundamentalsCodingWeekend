package robotSample;

import java.util.Arrays;

public class Robot {
    private int seriesNo;
    private int price;
    private String name;
    //Pvz.: Wheels, boots, helmet, gloves
    private Addon addon;
    //pvz.: navigation, weatherApp, spotify...
    private RobotFeature [] robotFeatures;

    public Robot(int seriesNo, int price, String name, Addon addon, RobotFeature[] robotFeatures) {
        this.seriesNo = seriesNo;
        this.price = price;
        this.name = name;
        this.addon = addon;
        this.robotFeatures = robotFeatures;
    }

    public Robot() {
    }

    public int getSeriesNo(int i) {
        return seriesNo;
    }

    public void setSeriesNo(int seriesNo) {
        this.seriesNo = seriesNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Addon getAddon() {
        return addon;
    }

    public void setAddon(Addon addon) {
        this.addon = addon;
    }

    public RobotFeature[] getRobotFeatures() {
        return robotFeatures;
    }

    public void setRobotFeatures(RobotFeature[] robotFeatures) {
        this.robotFeatures = robotFeatures;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "seriesNo=" + seriesNo +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", addon=" + addon +
                ", robotFeatures=" + Arrays.toString(robotFeatures) +
                '}';
    }
}
