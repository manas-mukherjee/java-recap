package corejava.masterclass.sec12_package_static_final;

public class StaticIntroMain {

    public static void main(String[] args) {
        StaticIntro i1 = new StaticIntro("i1");
        System.out.println(StaticIntro.getNumInstances());

        StaticIntro i2 = new StaticIntro("i2");
        System.out.println(StaticIntro.getNumInstances());

        StaticIntro i3 = new StaticIntro("i3");
        System.out.println(StaticIntro.getNumInstances());
    }
}
