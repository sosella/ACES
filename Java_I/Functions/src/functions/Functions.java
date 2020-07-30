/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author steph
 */
public class Functions
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        TestFunctions();
        TestProcedures();
        TestReturn();
        TestRecursion();
    }

    private static void TestRecursion()
    {
        recursiveProcedure(10);
    }

    private static void recursiveProcedure(int N)
    {
        // Stop Condition
        if (N < 0)
        {
            return;
        }
        System.out.println("In recursiveProcedure: " + N);
        recursiveProcedure(N - 1);
    }

    private static void TestReturn()
    {
        loopTo(5);
        loopTo(3);
        loopToStopAt(10,5);
        loopToStopAt(5,2);
        loopToStopAt(5,6);
    }

    private static void loopTo(int N)
    {
        System.out.println("In loopTo " + N);
        for (int i = 0; i < N; i++)
        {
            System.out.println(i);
        }
    }

    private static void loopToStopAt(int N, int M)
    {
        System.out.println("In loopToStopAt " + N + ", " + M);
        for (int i = 0; i < N; i++)
        {
            System.out.println(i);
            if (i == M)
            {
                return;
            }
        }        
    }
    
    private static void TestProcedures()
    {
        procedure1();
        procedure2("Hello, world!");
        procedure1("Hello, world!");
        procedure1(1.23);
        // Don't always have to use literals
        // Can pass the *value of variables*
        String msg = "This is the message";
        procedure1(msg);
    }

    private static void procedure1()
    {
        System.out.println("In procedure1");
    }

    private static void procedure1(String msg)
    {
        System.out.println("In procedure1: " + msg);
    }

    private static void procedure1(double num)
    {
        System.out.println("In procedure1: " + num);
    }

    private static void procedure2(String msg)
    {
        System.out.println("In procedure2: " + msg);
    }
    
    private static void TestFunctions()
    {
        int result = add(1, 2);    // Call or Invoke the add function
        System.out.println(result);

        int result2 = add(3, -4);    // Call or Invoke the add function
        System.out.println(result2);

        long result3 = addLong(3, 4);
        System.out.println(result3);

        long result4 = funcWithNoParameters();
        System.out.println(result4);

        long result5 = add(3l, 4l);
        System.out.println(result5);
        
        long result6 = add(3, 4l);
        System.out.println(result6);

        // Which signature will the compiler chose?
        // It will chose add(long,long) because of the signaure, 
        // not because of the result/return data type
        // The long result returned by the function is cast to a double
        double result7 = add(3, 4l);
        System.out.println(result7);

        // Choses add(double,double)
        double result8 = add(1.23, 4.56);
        System.out.println(result8);

        // Pass float literals
        float result9 = add(1.23f, 4.56f);
        System.out.println(result8);

        float var = 1.23f;
        System.out.println(var);
        float result10 = change(var);   // passing in the *value* of var
        System.out.println(var);        // see that the value of var did not change
        System.out.println(result10);
    }

    private static float change(float num)
    {
        System.out.println("In change: " + num);
        num += 10;
        return num;
    }
    
    static                  // Access Modifiers
    int                     // Return type
    add                     // Function Name
    (int i, int j)          // Parameter List
    {
        System.out.println("in add(int,int)");
        int sum = i + j;    // Function Body
        return sum;         // Return Expression
    }

    // Same function name, but different parameter list (number, order, and data types)
    // The function name and the parameter list define the function 'signature'
    // Different 'signature'
    // This is called function name 'overloading'
    static long add(long i, long j)
    {
        System.out.println("in add(long,long)");
        long sum = i + j;
        return sum;
    }

    static long add(long i, long j, long n)
    {
        System.out.println("in add(long,long,long)");
        long sum = i + j + n;
        return sum;
    }
    
    static float add(float i, float j)
    {
        System.out.println("in add(float,float)");
        float sum = i + j;
        return sum;
    }
    
    static double add(double i, double j)
    {
        System.out.println("in add(double,double)");
        double sum = i + j;
        return sum;
    }

    static long addLong(long i, long j)
    {
        System.out.println("in addLong(long,long)");
        long sum = i + j;
        return sum;
    }

    static long funcWithNoParameters()
    {
        long sum = 5 + 5;
        return sum;
    }
}
