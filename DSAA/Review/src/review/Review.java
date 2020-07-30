package review;

import java.io.IOException;
import static java.lang.System.in;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Review
{
    public enum Day
    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args)
    {
        StardardInput();
        //PredefinedDataTypes();
        //ArithmeticOperators();
        //Strings();
        //Arrays();
        //ConditionalStatements();
        //Looping();
        //Functions();
        //Classes();
        //Inheritance();
        //Generics();
        //Interfaces();
        //Exceptions();
        //JavaClassLibrary();
    }    

    private static void StardardInput()
    {
        try {
            int ch;
            System.out.print ("Enter some text: ");
            while ((ch = System.in.read ()) != '\n') {
                System.out.print ((char) ch);
            }
        } catch (IOException ex) {
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    // See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    private static void PredefinedDataTypes()
    {
        // Characters
        char c = 'a';
        System.out.println("c=" + c);

        // Integers
        byte b = 8;
        short s = 123;
        int i = 10;
        long l = 1024;
        int i2 = (int)l;        // may throw exception
        long l2 = i;
        System.out.println("b=" + b + " s=" + s + " i=" + i + " l=" + l + " i2=" + i2 + " l2=" + l2);

        // Floating-Point - IEEE 754 standard
        float f = 125.32f;
        double d = 125.32;
        System.out.println("f=" + f + " d=" + d);
        
        float f2 = (float)d;    // may throw exception
        double d2 = f;
        double d3 = f2;
        System.out.println("f2=" + f2 + " d2=" + d2 + " d3=" + d3);

        System.out.println("Does f == d2 ? " + ((f == d2) ? "YES" : "NO"));
        
        // Boolean
        boolean bo = true;
        System.out.println("bo=" + bo);
    }

    private static void ArithmeticOperators()
    {
        int n = 10;
        int m = 20;

        System.out.println("(n + m)=" + (n + m));
        System.out.println("(n - m)=" + (n - m));
        System.out.println("(n * m)=" + (n * m));
        System.out.println("(n / m)=" + (n / m));
        System.out.println("(n % m)=" + (n % m));

        // Multiply and Divide before you Add and Subtract
        System.out.println("(n + m * m - n / m)=" + (n + m * m - n / m));
        System.out.println("(n + (m * m) - (n / m)))=" + (n + (m * m) - (n / m)));

        // Increment Operators
        System.out.println("n=" + n);
        System.out.println("n++=" + n++);
        System.out.println("--n=" + --n);
        System.out.println("n--=" + n--);
        System.out.println("++n=" + ++n);
        System.out.println("(n += m)=" + (n += m));
        System.out.println("(n -= m)=" + (n -= m));
        System.out.println("n=" + n);
    }

    private static void Strings()
    {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        System.out.println("s1=" + s1 + ", s2=" + s2 + ", s3=" + s3);

        String s4 = s1 + s2 + s3;
        System.out.println("s4=" + s4);

        char[] charArray = {'a', 'b', 'c'};
        String str = String.valueOf(charArray);
        System.out.println("str=" + str);

        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);

        System.out.println("FirstNonRepeatedChar");
        System.out.println(FirstNonRepeatedChar(null));
        System.out.println(FirstNonRepeatedChar("a"));
        System.out.println(FirstNonRepeatedChar("ab"));
        System.out.println(FirstNonRepeatedChar("total"));
        
        System.out.println("ReverseString");
        System.out.println(ReverseString(null));
        System.out.println(ReverseString("a"));
        System.out.println(ReverseString("ab"));
        System.out.println(ReverseString("abc"));
        System.out.println(ReverseString("abcd"));
        System.out.println(ReverseString("abcde"));

        System.out.println("ReverseStringRecursive");
        System.out.println(ReverseStringRecursive(null));
        System.out.println(ReverseStringRecursive("a"));
        System.out.println(ReverseStringRecursive("ab"));
        System.out.println(ReverseStringRecursive("abc"));
        System.out.println(ReverseStringRecursive("abcd"));
        System.out.println(ReverseStringRecursive("abcde"));
    }

    private static char FirstNonRepeatedChar(String str)
    {
        if ((null == str) || (str.length() == 0)) {
            return (char)-1;
        }
        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                return str.charAt(i);
            }
        }
        return (char)-1;
    }

    private static String ReverseString(String str)
    {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        char[] strReversed = new char[str.length()];
        int mid = str.length() / 2;
        for (int i = 0, j = str.length() - 1; i <= mid; i++, j--) {
            strReversed[i] = str.charAt(j);
            strReversed[j] = str.charAt(i);
        }
        return String.valueOf(strReversed);
    }

    private static String ReverseStringRecursive(String str)
    {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return ReverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    private static void Arrays()
    {
        int[] anArray = new int[3];
        for (int i = 0; i < 3; i++)
        {
            anArray[i] = i * 2;
        }
        for (int i = 0; i < 3; i++)
        {
            System.out.println("i=" + i + " anArray[i]=" + anArray[i]);
        }

        int[][] multArray = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                multArray[i][j] = i * j;                
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("i,j=" + i + " " + j + " multArray[i][j]=" + multArray[i][j]);
            }
        }
    }

    private static void ConditionalStatements()
    {
        int n = 10;
        int m = 20;

        if (n < m)
        {
            System.out.println("n < m");
        }
        else
        {
            System.out.println("n >= m");
        }

        // Ternary Operator
        String output = (n < m) ? "n < m" : "n >= m";
        System.out.println(output);
        
        Day day = Day.SUNDAY;
        switch (day)
        {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    private static void Looping()
    {
        for (int n = 0; n < 3; n++)
        {
            System.out.println("n=" + n);
        }

        int n = 0;
        while (n < 3)
        {
            System.out.println("n=" + n);
            n++;
        }

        n = 0;
        do
        {
            System.out.println("n=" + n);
            n++;
        }
        while (n < 3);

        for (int m = 0; m < 10; m++)
        {
            if ((m % 2) == 1)
            {
                break;
            }
            System.out.println("m=" + m);
        }


        for (int m = 0; m < 10; m++)
        {
            if ((m % 2) == 1)
            {
                continue;
            }
            System.out.println("m=" + m);
        }
    }

    private static void Functions()
    {
        double result = Func(10);
        System.out.println("result="+result);
    }

    private static double Func(int i)
    {
        return i * 1.23;
    }

    private static class Person
    {
        public String Name;
        
        Person(String name)
        {
            Name = name;
        }
    }
    
    private static void Classes()
    {
        Person person = new Person("Lisa");
        System.out.println("person.Name=" + person.Name);
    }

    private static class Employee extends Person
    {
        public String Id;
        
        Employee(String name, String id)
        {
            super(name);
            Id = id;
        }
    }
    
    private static class Manager extends Employee
    {
        public String Title;
        
        Manager(String name, String id, String title)
        {
            super(name, id);
            Title = title;
        }
    }
    
    private static void Inheritance()
    {
        Employee employee = new Employee("Mark", "123");
        System.out.println("employee.Name=" + employee.Name + " employee.Id=" + employee.Id);

        Manager manager = new Manager("Judy", "456", "President");
        System.out.println("manager.Name=" + manager.Name + " manager.Id=" + manager.Id + " manager.Title=" + manager.Title);
    }

    private static class Wrapper<T>
    {
        private final T t;

        public Wrapper(T _t)
        {
            t = _t;
        }
        
        public T get() {
           return t;
        }
    }
    
    private static void Generics()
    {
        Wrapper intWrapper = new Wrapper(10);
        System.out.println(intWrapper.get());

        Wrapper strWrapper = new Wrapper("Hello, World!");
        System.out.println(strWrapper.get());
    }

    private interface IMyInterface1
    {
        public void method1();
        public void method2();
    }

    private interface IMyInterface2
    {
        public int method1(int x);
        public int method2(int x);
    }

    private static class InterfaceTestClass implements IMyInterface1, IMyInterface2
    {
        @Override
        public void method1()
        {
            System.out.println("implementation of IMyInterface1.method1");
        }

        @Override
        public void method2()
        {
            System.out.println("implementation of IMyInterface1.method2");
        }

        @Override
        public int method1(int x)
        {
            System.out.println("implementation of IMyInterface2.method1: " + x);
            return x;
        }

        @Override
        public int method2(int x)
        {
            System.out.println("implementation of IMyInterface2.method2: " + x);
            return x;
        }
    }
    
    private static void Interfaces()
    {
        InterfaceTestClass itc = new InterfaceTestClass();
        itc.method1();
        itc.method2();
        itc.method1(1);
        itc.method2(2);
    }

    private static void Exceptions()
    {
        try
        {
            throw new Exception("Simulate an exception.");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

    private static void JavaClassLibrary()
    {
        System.out.println("JavaClassLibrary");

        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println("n=" + n);

        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(MiddleNode(list));
    }

    private static int MiddleNode(LinkedList<Integer> list) {
        int len = list.size();
        if ((len % 2) == 0) {
            return -1;
        }
        return list.get(len / 2);
    }
}
