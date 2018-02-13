package corejava.masterclass.sec10_abstruct_interface.innerclass;

public class InnerNonStaticGearboxMain {
    public static void main(String[] args) {
        InnerNonStaticGearbox gearbox = new InnerNonStaticGearbox(6);
        InnerNonStaticGearbox.Gear first = gearbox.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
    }
}
