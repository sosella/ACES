/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListTest();
        ArrayListTest();
        HashMapTest();
        HashMapObjectTest();
    }

    private static void LinkedListTest()
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(0);
        list.addFirst(-1);
        list.add(1);
        list.addLast(2);
        list.add(3);

        System.out.print("List with iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("List with for loop: ");
        for (int i : list)
        {
            System.out.print(i + " ");            
        }
        System.out.println();

        System.out.print("List with forEach: ");
        list.forEach(
            // Lamda Expression
            // Anonymous function
            (i) -> { System.out.print(i + " "); }
        );
        System.out.println();

        // Binary Search
        int loc3 = Collections.binarySearch(list, 3);
        System.out.println("Location of 3 = " + loc3);

        // Randomize list
        Collections.shuffle(list);

        // display randomized list
        PrintCollection(list, "LinkedList shuffled: ");

        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("Maximum: " + Collections.max(list));
        
        // Print list in reverse natural order
        // Create a reverse natural ordering comparator
        Comparator cmpReverseNaturalOrder = Collections.reverseOrder();

        // Sort list by using the comparator
        Collections.sort(list, cmpReverseNaturalOrder);

        PrintCollection(list, "LinkedList sorted in reverse natural order: ");

        System.out.println("Does the list contain " + 3 + "? " + list.contains(3));
        System.out.println("Does the list contain " + 4 + "? " + list.contains(4));

        list.remove(1); // at index 1
        PrintCollection(list, "List: ");

        list.removeLast();
        PrintCollection(list, "List: ");
    }

    private static void ArrayListTest()
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        PrintCollection(list, "List: ");
    }

    private static void PrintCollection(Collection<Integer> col, String title)
    {
        System.out.print(title);
        col.forEach(
            (i) -> { System.out.print(i + " "); }
        );
        System.out.println();
    }

    private static void HashMapTest()
    {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "Hello");
        map.put(32, "There");
        map.put(1009, "World");
        PrintMap(map, "Map: ");
    }

    private static void PrintMap(HashMap<Integer, String> map, String title)
    {
        System.out.println(title);
        Set<Integer> keySet = map.keySet();
        keySet.forEach(
            (key) -> { System.out.println("key=" + key + " value=" + map.get(key)); }
        );
        System.out.println();
    }

    private static void HashMapObjectTest()
    {
        HashMap<Integer,Account> map = new HashMap<>();

        map.put(10100, new Account("Joe", "Smith"));
        map.put(21990, new Account("Barbara", "Jones"));
        map.put(21991, new Account("Keith", "Cooper"));
        PrintAccounts(map, "Accounts:");
    }

    private static void PrintAccounts(HashMap<Integer, Account> map, String title)
    {
        System.out.println(title);
        Set<Integer> acctNbrs = map.keySet();
        acctNbrs.forEach(
           (acctNbr) -> { System.out.println("Account # = " + acctNbr + " value=" + map.get(acctNbr)); }
        );
    }
}
