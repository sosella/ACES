/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

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

    public static void Test1()
    {
        System.out.println("Test 1");

        Queue queue = new Queue();

        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        PrintQueue(queue);
    }

    public static void Test2()
    {
        System.out.println("Test 2");

        Queue queue = new Queue();

        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        PrintQueue(queue);

        queue.Dequeue();
        PrintQueue(queue);

        queue.Dequeue();
        PrintQueue(queue);

        queue.Dequeue();
        PrintQueue(queue);
    }

    private static void PrintQueue(Queue queue)
    {
        System.out.println("Queue: " + queue);
    }
}
