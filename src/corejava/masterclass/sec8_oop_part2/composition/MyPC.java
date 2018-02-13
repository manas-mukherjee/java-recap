package corejava.masterclass.sec8_oop_part2.composition;

public class MyPC {
    private Motherboard motherboard;
    private Monitor monitor;

    public MyPC(Motherboard motherboard, Monitor monitor) {
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public static void main(String[] args) {
        Resolution nativeResolution = new Resolution(1, 15);
        Monitor monitor = new Monitor("FX", "Song", 5, nativeResolution);
        Motherboard motherboard = new Motherboard("XGame","Asus",4,6,"super bios");
        MyPC myPC = new MyPC(motherboard, monitor);
        System.out.println(myPC);

        myPC.getMonitor().drawPixelAt(10,20,"red");
    }

    @Override
    public String toString() {
        return "MyPC{" +
                "motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
