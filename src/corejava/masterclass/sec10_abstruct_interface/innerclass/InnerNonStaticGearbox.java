package corejava.masterclass.sec10_abstruct_interface.innerclass;

import java.util.ArrayList;

public class InnerNonStaticGearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear =0;

    public InnerNonStaticGearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear gear1 = new Gear(0,0.0);
        this.gears.add(gear1);
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }
    }
}
