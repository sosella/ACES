/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Test1();
        Test2();
        Test3();
        Test4();
        Test5();
    }

    private static void Test1()
    {
        System.out.println("Test 1");
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.Append(1);
        list.Append(2);
        list.Append(3);
        list.Append(4);
        list.Append(5);
        PrintList(list);

        list.Remove(3);
        PrintList(list);

        list.Remove(1);
        PrintList(list);

        list.Remove(5);
        PrintList(list);

        list.Remove(2);
        PrintList(list);

        list.Remove(4);
        PrintList(list);
    }

    private static void Test2()
    {
        System.out.println("Test 2");
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.Prepend(5);
        list.Prepend(4);
        list.Prepend(3);
        list.Prepend(2);
        list.Prepend(1);
        PrintList(list);

        list.Remove(3);
        PrintList(list);

        list.Remove(1);
        PrintList(list);

        list.Remove(5);
        PrintList(list);

        list.Remove(2);
        PrintList(list);

        list.Remove(4);
        PrintList(list);
    }

    private static void Test3()
    {
        System.out.println("Test 3");
        
        DoublyLinkedList list = new DoublyLinkedList();

        Node one = list.Append(1);
        Node three = list.InsertAfter(one, 3);
        Node two = list.InsertBefore(three, 2);
        Node five = list.InsertAfter(three, 5);
        Node four = list.InsertBefore(five, 4);

        PrintList(list);
    }

    private static void Test4()
    {
        System.out.println("Test 4");
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.InsertAfter(list.InsertAfter(list.InsertAfter(list.InsertAfter(list.Append(1), 2), 3), 4), 5);

        PrintList(list);
    }

    private static void Test5()
    {
        System.out.println("Test 5");
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.InsertBefore(list.InsertBefore(list.InsertBefore(list.InsertBefore(list.Append(5), 4), 3), 2), 1);

        PrintList(list);
    }

    public static void PrintList(DoublyLinkedList list)
    {
        System.out.println("List: " + list.toString());
    }
}
