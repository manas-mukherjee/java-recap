package corejava.masterclass.sec12_package_static_final;

public class FinalIntro {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public FinalIntro(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created. Instance is : " + instanceNumber);
    }

    public int getInstanceNumber() {
        return this.instanceNumber;
    }
}
