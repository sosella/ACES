/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1();
        Test2();
    }

    private static void Test1() {
        System.out.println("Test 1");
        
        Stack stack = new Stack();

        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        PrintStack(stack);
    }

    private static void Test2() {
        System.out.println("Test 2");
        
        Stack stack = new Stack();

        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        PrintStack(stack);

        stack.Pop();
        PrintStack(stack);
        stack.Pop();
        PrintStack(stack);
        stack.Pop();
        PrintStack(stack);
        stack.Pop();
        PrintStack(stack);
    }

    private static void PrintStack(Stack stack) {
        System.out.println("Stack: " + stack);
    }
}
