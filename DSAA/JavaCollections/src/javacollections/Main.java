package javacollections;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        LinkedListTest();
        ArrayListTest();
        MapTest();
    }

    private static void LinkedListTest()
    {
        // Create list
        LinkedList<Integer> list = new LinkedList<>();
        
        // Initialize list
        list.add(-8);
        list.add(20);
        list.add(-20);
        list.add(8);

        System.out.print("LinkedList with for: ");
        for (int i : list)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("LinkedList with forEach: ");
        list.forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println();

        System.out.print("LinkedList with iterator: ");
        Iterator<Integer> li = list.iterator();
        while(li.hasNext()) {
           System.out.print(li.next() + " ");
        }
        System.out.println();
        
        // Binary Search
        int loc20 = Collections.binarySearch(list, 20);
        System.out.println("Location of 20 = " + loc20);

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
    }

    private static void ArrayListTest()
    {
        // Create list
        ArrayList<Integer> list = new ArrayList<>();

        // Initialize list
        list.add(-8);
        list.add(20);
        list.add(-20);
        list.add(8);

        PrintCollection(list, "ArrayList: ");

        list.add(1, 10);
        PrintCollection(list, "ArrayList after add at index 1: ");

        list.remove(2);
        PrintCollection(list, "ArrayList after remove at index 2: ");
    }

    private static void PrintCollection(Collection<Integer> col, String title)
    {
        System.out.print(title);
        col.forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println();
    }

    private static void MapTest()
    {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(0, "Hello");
        map.put(1, "There");
        map.put(2, "World");

        PrintMap(map, "Map: ");

        System.out.println("Map with keySetIterator: ");
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> keySetIterator = keySet.iterator();
        while (keySetIterator.hasNext())
        {
            int key = keySetIterator.next();
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
    }

    private static void PrintMap(HashMap<Integer, String> map, String title)
    {
        System.out.println(title);
        map.keySet().forEach((key) -> {
            System.out.println("key: " + key + ", value: " + map.get(key));
        });
    }
}
