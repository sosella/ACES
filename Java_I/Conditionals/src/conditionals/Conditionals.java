/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

/**
 *
 * @author steph
 */
public class Conditionals {

    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // If the expression evaluates to true, then execute the code in the block
        if (true)  // this evaluates to true
        // Block of code
        {
            System.out.println("Condition evaluated to true.");
            System.out.println("Other statement.");
        }

        if (false)  // this evaluates to false
        {
            System.out.println("Will this block of code be executed?");
        }

        if (2 > 1)  // this evaluates to true
        {
            System.out.println("2 is greater than 1");
        }
        
        int n = 2;
        int m = 1;
        if (n > m)  // this evaluates to true
        {
            System.out.println(n + " is greater than " + m);
        }

        n = 1;
        m = 2;
        if (n > m)  // this evaluates to false
        {
            System.out.println(n + " is greater than " + m);
        }

        // 2 is greater than 1, AND 4 is greater than 3
        if ((2 > 1) && (4 > 3))  // this evaluates to true
        {
            System.out.println("2 is greater than 1");
            System.out.println("AND");
            System.out.println("4 is greater than 3");
        }

        // Relational and Logical Operators
        if (2 <= 1) // opposite of (1 > 2)
        {
            System.out.println("Relational and Logical expression evalutes to true");
        }

        boolean e1 = false;
        boolean e2 = false;
        if (e1 && e2)
        {
            System.out.println("Logical AND Evalutes to true");
        }

        e1 = false;
        e2 = false;
        if (e1 || e2)
        {
            System.out.println("Logical OR Evalutes to true");
        }

        // Combined 2 relational expressions with a logical expression
        if ((2 > 1) && (4 > 3))
        {
            System.out.println("(2 > 1) && (4 > 3) evaluates to true");
        }

        if ((2 > 1) || (3 > 4))
        {
            System.out.println("(2 > 1) || (3 > 4) evaluates to true");
        }

        // Operator precedence rules!
        if ((2 > 1) || (3 > 4) && (6 < 5))
        {
            System.out.println("(2 > 1) || (3 > 4) && (6 < 5)");
        }

        // If-Then-Else
        if ((2 > 1) || (3 > 4))
        {
            System.out.println("Executes when the expression evaluates to true");
        }
        else    // Otherwise
        {
            System.out.println("Executes when the expression evaluates to false");            
        }

        // Ternary Statement
        int i;
        if (1 > 2)
        {
            i = 2;
        }
        else
        {
            i = 1;
        }
        System.out.println("i = " + i);

        i = (1 > 2) ? // Conditional expression
            2 :       // value if evaluates to true
            1;        // value if evaluates to false
        System.out.println("i = " + i);

        i = (1 > 2) ? (3 * 4) : (5 * 6);
        System.out.println("i = " + i);

        if (args.length == 4)
        {
            int a0 = Integer.parseInt(args[0]);
            int a1 = Integer.parseInt(args[1]);
            int a2 = Integer.parseInt(args[2]);
            int a3 = Integer.parseInt(args[3]);
            int j = (a0 > a1) ? a2 : a3;
            System.out.println(j + " = (" + a0 + " > " + a1 + ") ? " + a2 + " : " + a3);
        }
        else
        {
            System.out.println("This program requires 4 arguments");            
        }

        // Switch Statement
        Season s = Season.SPRING;
        switch (s)
        {
            case WINTER:
                System.out.println("The Season is WINTER");
                break;  // Leave the switch statement
            case SPRING:
                System.out.println("The Season is SPRING");
                break;
            case SUMMER:
                System.out.println("The Season is SUMMER");
                break;
            case FALL:
                System.out.println("The Season is FALL");
                break;
        }
        // Program flow will go here after the break in the switch statement

        int val = 2;
        switch (val)
        {
            case 0:
                System.out.println("val = " + 0);
                break;  // Leave the switch statement
            case 1:
                System.out.println("val = " + 1);
                break;  // Leave the switch statement
            default:    // None of the cases matched the switch expression
                System.out.println("Error!!! None matched: " + val);
                break;  // Leave the switch statement
        }

        int userInput = Integer.parseInt(args[0]);
        switch (userInput)
        {
            case 0:
                System.out.println("The User entered 0");
                break;  // Leave the switch statement
            case 1:
                System.out.println("The User entered 1");
                break;
            case 2:
                System.out.println("The User entered 2");
                break;
            case 3:
                System.out.println("The User entered 3");
                break;
            default:
                System.out.println("The User entered " + userInput);
                break;
        }
    }
}
