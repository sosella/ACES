/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author steph
 */
public class Looping
{
    public static void main(String[] args)
    {
        System.out.println("Basic for loop");
        for (
            int n = 0;      // initialize expression
            n < 10;         // test expression
            n = n + 1) {    // next expression
            System.out.println("n = " + n);
        }

        System.out.println("Using the increment operator");
        for (
            int n = 0;      // initialize expression
            n < 10;         // test expression
            n++) {          // next expression
            System.out.println("n = " + n);
        }

        System.out.println("Using the add-to operator");
        for (
            int n = 0;      // initialize expression
            n < 10;         // test expression
            n += 1) {       // next expression
            System.out.println("n = " + n);
        }

        System.out.println("In reverse using the decrement operator");
        for (
            int n = 9; // initialize expression (do this first and once)
            n >= 0;    // test expression (do this second and each time before the block)
            n--) {     // next expression (do this after the block of code each time)
            System.out.println("n = " + n);
        }

        // Create a code block to scope variables
        {
            System.out.println("Any or all expressions are optional");
            int n = 9;          // initialize here instead
            for (
                ;               // initialize expression is optional
                n >= 0;         // test expression
                n--) {          // next expression
                System.out.println("n = " + n);
            }            
        }

        // Code block limits use and visibility of a variables inside the block
        {
            System.out.println("All expressions are optional");
            int n = 9;      // initialize expression (1st and once)
            for ( ; ; )
            {
                if (n >= 0) // test expression (2nd and each time)
                {
                    // Execute conditional block of code
                    System.out.println("n = " + n);
                }
                else // n < 0
                {
                    break;  // exit loop
                }
                n--;        // next expression (3rd - after the block of code)
            }
            // Control is transfered here after the break statement
            System.out.println("After the for loop");
        }

        {
            System.out.println("Use continue");
            for (int n = 0; n < 10; n++)
            {
                // Use modulus (remainder) operator
                if ((n % 2) == 0)   // 0 or 1 - checking even or odd
                {
                    continue;   // skip rest of the loop block of code
                }
                System.out.println("n = " + n);                
            }
        }

        {
            System.out.println("Use return");
            for (int n = 0; n < 10; n++)
            {
                // Use modulus (remainder) operator
                if ((n % 2) == 1)   // 0 or 1 - checking even or odd
                {
                    //return;   // exit function
                }
                System.out.println("n = " + n);                
            }
            System.out.println("After the for loop");
        }

        {
            System.out.println("Multiple variables");
            for (int n = 0, m = 20; n < 10; n++, m -= 2)
            {
                System.out.println("n = " + n + ", m = " + m);                
            }
        }

        {
            System.out.println("Multiple for-loops");
            for (int n = 0, i = 1; n < 10; n++)
            {
                for (int m = 20; m > 0; m -= 2, i++)
                {
                    System.out.println("i: " + i + " -> n = " + n + ", m = " + m);                
                }
            }
        }

        {
            System.out.println("While loop");
            int n = 0;      // 1st
            while (n < 10)  // 2nd and each loop
            {
                System.out.println("n = " + n);                
                n++;    // 3rd and each loop
            }
        }

        {
            System.out.println("For loop that mimics a While loop");
            int n = 0;          // 1st
            for ( ; n < 10 ; )  // 2nd and each loop
            {
                System.out.println("n = " + n);                
                n++;            // 3rd and each loop
            }
        }

        {
            System.out.println("While loop with break");
            int n = 0;      // 1st
            while (n < 10)  // 2nd and each loop
            {
                if ((n % 2) == 1)
                {
                    break;
                }
                System.out.println("n = " + n);                
                n++;    // 3rd and each loop
            }
            System.out.println("Statement after the while loop");                
        }

        {
            System.out.println("do-while loop");
            int n = 0;
            do
            {
                // Block of code executed at least once
                System.out.println("n = " + n);                
                n++;
            } while (n < 10);
        }

        {
            System.out.println("for each loop");
            int[] ary = {1, 2, 3, 4, 5};
            for (int n : ary)
            {
                // Block of code executed at least once
                System.out.println("n = " + n);                
            }
        }

        {
            System.out.println("for each loop with continue");
            int[] ary = {1, 2, 3, 4, 5};
            for (int n : ary)
            {
                if ((n % 2) == 1)
                {
                    continue;
                }
                // Block of code executed at least once
                System.out.println("n = " + n);                
            }
        }

        {
            System.out.println("length of args = " + args.length);
            if (args.length >= 1)
            {
                System.out.println("args[0] = " + args[0]);                
            }
            if (args.length >= 2)
            {
                System.out.println("args[1] = " + args[1]);                
            }
            if (args.length >= 3)
            {
                System.out.println("args[2] = " + args[2]);                
            }
            if (args.length >= 4)
            {
                System.out.println("args[3] = " + args[3]);                
            }
        }
    }
}
