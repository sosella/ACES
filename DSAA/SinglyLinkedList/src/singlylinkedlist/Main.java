/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

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
    }

    private static void Test1()
    {
        System.out.println("Test 1");
        
        LinkedList list = new LinkedList();

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
        
        LinkedList list = new LinkedList();

        Node one = list.Append(1);
        Node three = list.InsertAfter(one, 3);
        Node two = list.InsertBefore(three, 2);
        Node five = list.InsertAfter(three, 5);
        Node four = list.InsertBefore(five, 4);

        PrintList(list);
    }

    private static void Test3()
    {
        System.out.println("Test 3");
        
        LinkedList list = new LinkedList();

        list.InsertAfter(list.InsertAfter(list.InsertAfter(list.InsertAfter(list.Append(1), 2), 3), 4), 5);

        PrintList(list);
    }

    private static void Test4()
    {
        System.out.println("Test 4");
        
        LinkedList list = new LinkedList();

        list.InsertBefore(list.InsertBefore(list.InsertBefore(list.InsertBefore(list.Append(5), 4), 3), 2), 1);

        PrintList(list);
    }

    private static void PrintList(LinkedList list)
    {
        System.out.println("List: " + GetList(list));
    }

    private static String GetList(LinkedList list)
    {
        String listStr = "";
        for (Node node = list.getFirst(); node != null; node = node.getNext())
        {
            if (node != list.getFirst())
            {
                listStr += ", ";
            }
            listStr += node.getData();
        }
        return listStr;
    }
}
