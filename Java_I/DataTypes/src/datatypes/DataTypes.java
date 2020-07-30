/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author steph
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Integers
        byte b = 123;
        short s = 1234;
        int i  = 12345;
        long l = 123456;
        System.out.println("b=" + b + ", s=" + s + ", i=" + i + ", l=" + l);
        long l2 = i;
        int i2 = (int)l;
        System.out.println("i2=" + i2 + ", l2=" + l2);
        int i3 = Integer.parseInt("12345");
        long l3 = Long.parseLong("123456");
        System.out.println("i3=" + i3 + ", l3=" + l3);

        // Operators: * / + -
        int result = 1 + 2;
        int result2 = 1 - 2;
        int result3 = 10 / 2;
        int result4 = 5 * 2;
        System.out.println("result=" + result);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);
        System.out.println("result4=" + result4);

        // Precedence Rule: * and / before + and -
        int result5 = 10 + 2 * 4;
        System.out.println("result5=" + result5);
        int result6 = (10 + 2) * 4;
        System.out.println("result6=" + result6);
        int result7 = 10 + (2 * 4);
        System.out.println("result7=" + result7);

        int result8 = 10 + 2 * 4 - 6 / 2;
        System.out.println("result8=" + result8);
        int result9 = 10 + (2 * 4) - (6 / 2);
        System.out.println("result9=" + result9);

        // Precedence Rule: Operations occur left-right ->
        int result10 = 10 * 2 / 4 * 6 / 2;
        System.out.println("result10=" + result10);
        int result11 = (((10 * 2) / 4) * 6) / 2;
        System.out.println("result11=" + result11);

        // += -= *= /=
        int result12 = 100;
        result12 += 10; // equivalent to result12 = result12 + 10;
        System.out.println("result12=" + result12);

        // Increment and Decrement: ++ --
        int result13 = 100;
        result13++; // equivalent to result13 = result13 + 1;
        System.out.println("result13=" + result13);

        // Floating point numbers
        double piAsDouble = 3.14159265359;
        System.out.println("piAsDouble=" + piAsDouble);

        float f1 = 125.10f;
        System.out.println("f1=" + f1);
        double f1AsDouble = f1;
        System.out.println("f1AsDouble=" + f1AsDouble);

        // Round-off error - an accumulation of error due to imprecision
        float f2 = 1.23f;
        double f2AsDouble = f2;
        System.out.println("f2=" + f2 + ", " + f2AsDouble);
        f2 *= 3;
        f2AsDouble = f2;
        System.out.println("f2=" + f2 + ", " + f2AsDouble);
        f2 *= 3;
        f2 *= 3;
        f2 *= 3;
        f2 *= 3;    // this operation causes round-off error
        f2AsDouble = f2;
        System.out.println("f2=" + f2 + ", " + f2AsDouble);
    }
}
