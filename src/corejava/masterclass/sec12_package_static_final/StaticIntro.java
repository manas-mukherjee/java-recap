package corejava.masterclass.sec12_package_static_final;

public class StaticIntro {

    private static int numInstances = 0;
    private static final int CONST = 0;
    private String name;

    static {

    }

    public StaticIntro(String name) {
        this.name = name;
        this.numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StaticIntro{" +
                "numInstances=" + numInstances +
                ", name='" + name + '\'' +
                '}';
    }
}
