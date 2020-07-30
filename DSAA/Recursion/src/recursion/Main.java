/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestFactorial();
        TestExponent();
        TestTowerOfHanoi();
        TestFibonacci();
        TestGreatestCommonDivisor();
    }

    private static void TestFactorial() {
        long n = 3;
        long result = factorial(n);
        System.out.println("The factorial of " + n + " is " + result);
        n = 17;
        result = factorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }

    private static long factorial(long n) {
        // base case: n = 0
        if (n <= 0) {
            return 1;
        }
        // n > 0
        else {
            return n * factorial(n - 1);
        }
    }

    private static void TestExponent() {
        long x = 2;
        long n = 3;
        long result = exponent(x, n);
        System.out.println(x + " to the power of " + n + " is " + result);

        x = 2;
        n = 6;
        result = exponent(x, n);
        System.out.println(x + " to the power of " + n + " is " + result);

        x = -2;
        n = 6;
        result = exponent(x, n);
        System.out.println(x + " to the power of " + n + " is " + result);

        x = -2;
        n = 5;
        result = exponent(x, n);
        System.out.println(x + " to the power of " + n + " is " + result);
    }

    private static long exponent(long x, long n)
    {
        if (n <= 0)
        {
            return 1;
        }
        else if (n == 1) {
            return x;
        }
        else {
             return x * exponent(x, n - 1);   
        }
    }

    private static void TestTowerOfHanoi() {
        long n = 3;
        long result = towerofhanoi(n);
        System.out.println("The minimum number of moves with " + n + " disks is " + result);

        n = 5;
        result = towerofhanoi(n);
        System.out.println("The minimum number of moves with " + n + " disks is " + result);
    }

    private static long towerofhanoi(long n) {
        // base case
        if (n == 1) {
            return 1;
        }
        // recursive case
        else {
            return 2 * towerofhanoi(n - 1) + 1;
        }
    }

    private static void TestFibonacci() {
        for (int n = 0; n <= 12; n++) {
            long result = fibonacci(n);
            System.out.println("The Fibonacci value of " + n + " is " + result);                    
        }
    }

    private static long fibonacci(long n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        // n >= 2
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }            
    }

    private static void TestGreatestCommonDivisor() {
        for (int x = 2; x <= 6; x++) {
            for (int y = 2; y <= 6; y++) {
                long result = greatestcommondivisor(x, y);
                System.out.println("The Greatest Common Divisor value of " + x + " and " + y + " is " + result);                                    
            }
        }
    }

    private static long greatestcommondivisor(long x, long y) {
        if (y == 0) {
            return x;
        }
        else {
            return greatestcommondivisor(y, x % y);
        }
    }
}
