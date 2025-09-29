package Core;

import static java.awt.Event.F3;

public class Variables_2 {
    public static void main(String[] args) {
        /*
        * Data types in java
    1. primitives
    2. non primitives
    here we will discuss only primitives
    types , size and range is given

    * byte:
Size: 1 byte (8 bits)
Range: -128 to 127

    * short:
Size: 2 bytes (16 bits)
Range: -32,768 to 32,767

    * int:
Size: 4 bytes (32 bits)
Range: -2,147,483,648 to 2,147,483,647

    * long:
Size: 8 bytes (64 bits)
Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    * float:
Size: 4 bytes (32 bits)
Range: Approximately ±3.4e-38 to ±3.4e+38 (single-precision floating-point)
Note: This type provides 6-7 decimal digits of precision.

    * double:
Size: 8 bytes (64 bits)
Range: Approximately ±1.7e-308 to ±1.7e+308 (double-precision floating-point)
Note: This type provides about 15 decimal digits of precision.

    * boolean:
Size: Varies (JVM-dependent, typically 1 bit for storage, but often represented as 1 byte in arrays for easier memory management).
Range: true or false

    * char:
Size: 2 bytes (16 bits)
Range: 0 to 65,535 (Unicode characters)
Note: Stores a single Unicode character.
        * */

        int i = 10 ; // integer
        byte b = 125 ; // byte
        short s = 125; // short
        float f = 3.14F; // float
        double d = 2345.2345D;// double
        long l = 3076871720L; // long
        char c = 'A'; // character
        boolean bool = true; // boolean


        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(c);
        System.out.println(bool);
    }
}
