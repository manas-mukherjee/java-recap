package sec12_package_static_final;

public class ScopeCheck {
    private int varOne = 1;
    private int publicVar = 1;

    public ScopeCheck() {
        System.out.format("Scopecheck created. varOne - %d, publicVar - %d \n", varOne, publicVar);
    }

    public int getVarOne() {
        return varOne;
    }

    public int privateVarMul2() {
        int varTwo = 2;

        for(int i=1; i<10; i++){
            System.out.println("local varOne : " + i * varTwo);
        }
        return varTwo;
    }

    public void useInner(){
        System.out.println("Invoked from outer. InnerClass: varThree : " + new InnerClass().varThree);
    }

    public class InnerClass{
        private int varThree = 3;

        public InnerClass() {
            System.out.format("Innerclass created. varOne is : %d, varThree is : %d \n", varOne, varThree);
        }

        public int privateVarMul2() {
            System.out.format("varOne is : %d", varOne);
            int privateVar = 2;

            for(int i=1; i<10; i++){
                System.out.println("local varOne : " + i * ScopeCheck.this.varOne);
            }
            return privateVar;
        }
    }
}
