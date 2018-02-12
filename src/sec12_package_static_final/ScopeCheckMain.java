package sec12_package_static_final;

public class ScopeCheckMain {
    public static void main(String[] args) {
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.privateVarMul2();
        scopeCheck.getVarOne();

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.privateVarMul2();
        scopeCheck.useInner();
    }
}
