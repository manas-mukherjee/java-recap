package corejava.masterclass.sec12_package_static_final;

public class StaticBlock {

    private static final int CONST;
    private int normalVar;

    public StaticBlock(int normalVar) {
        System.out.println("constructor called : " + normalVar );
        this.normalVar = normalVar;
    }

    static {
        CONST = 19;
        System.out.println("static block - " + CONST);
    }

    public static void main(String[] args) {
        System.out.println("main method called");
        new StaticBlock(100);
    }

    static {
        System.out.println("2nd static block");
    }
}
