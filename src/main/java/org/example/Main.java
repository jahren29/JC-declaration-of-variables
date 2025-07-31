package org.example;
import java.lang.System.*;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

        static int staticHex = 0x1A2B;
        static byte staticByte = 1;
        static String staticString = "Progress, not perfection";

    public static void main (String[] args){

        int localDecimal = 100;
        int localHex = 0xff;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10000000L;
        String localString = "Every step I take gets me closer to my goal.";

        out.println("localDecimal = " + localDecimal);
        out.println("localHex = " + localHex);
        out.println("localBinary = " + localBinary);
        out.println("localOctal = " + localOctal);
        out.println("localLong = " + localLong);
        out.println("localString = " + localString);


        instanceVariables instanceVariables = new instanceVariables();

        out.println();
        instanceVariables.print();
        out.println();

        out.println("Static Variable: ");
        out.println("staticHex = " + staticHex);
        out.println("staticByte = " + staticByte);
        out.println("staticString" + staticString);
    }


}