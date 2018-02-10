package variables_datatypes_operators;

public class Hello {
    public static void main(String args[]){
        //Primative data types
        //intByteIntShortLong();
        //floatDouble();
        //charBoolean();
        //Primative data types
        //stringType();
        operator();
    }

    //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
    //http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
    private static void operator() {
        // +,-,*,/
        boolean isCar = false;
        String isCarType = isCar == false ? "False" : "True";
        System.out.println(isCarType);
    }

    private static void stringType() {
        String myString = "variables_datatypes_operators.Hello World!";
        System.out.println(myString + " \u00A9 what is the purpose ?");
    }

    // Reference - http://www.fileformat.info/info/unicode/utf8.htm
    // https://stackoverflow.com/questions/643694/what-is-the-difference-between-utf-8-and-unicode
    // https://unicode-table.com/en/

    private static void charBoolean() {
        char c = 'M';
        // width of char is 16bytes.
        char unicodeChar = '\u00AE';
        System.out.println("Normal char - " + c);
        System.out.println("Unicode char - " + unicodeChar);

        boolean isMale = true;
    }

    private static void floatDouble() {
        // Single Vs Double precision
        int myIntValue = 5; // 4 byes
        float myFloatValue = 5f/3;  // single - p:7 // 4 bytes
        double myDoubleValue = 5d/3; // double - p:16 // 8 bytes // fast // in-buit java functions use this

        System.out.println("myIntevalue : " + myIntValue);
        System.out.println("myFloatValue : " + myFloatValue);
        System.out.println("myDoubleValue : " + myDoubleValue);

        //Assignment
        int p = 200;
        double factor = 0.45359237d;
        double res = p*factor;
        System.out.println("Kgs : " + res);

        double pi = 3_141_592d;
        System.out.println("\n pi : " + pi);
    }

    private static void intByteIntShortLong() {
        // int has a width of 32
        int minInt = -2_147_483_648; // literal
        int maxInt = 2_147_483_647;

        System.out.format("\n minInt : %d, maxInt : %d " , minInt, maxInt);

        // byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;

        System.out.format("\n minByte : %d, maxByte : %d " , minByte, maxByte);

        // short has a width of 16
        short myShortVal = 32767;
        System.out.format("\n myShortVal : %d" , myShortVal);

        // long has a width of 64
        long minLong = -9_223_327_036_854_775_807L;
        long maxLong = 127L;

        System.out.format("\n minLong : %d, maxLong : %d " , minLong, maxLong);

        //Assignment
        byte b = 10;
        short s = 20;
        int i = 50;
        long l = 50000 + 10*(b + s + i);
        System.out.println("\nLong value : " + l);
        short st = (short) l;
        System.out.println("\nShort value : " + st);

        st = (short) (50000 + 10*(b + s + i));
        System.out.println("\nShort value : " + st);
    }
}
