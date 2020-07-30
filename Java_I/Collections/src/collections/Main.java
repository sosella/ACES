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
        // Array Data Structure
        System.out.println("Array");
        int[] numberArray = new int[10];
        for (int i = 0; i < 10; i++) {
            numberArray[i] = randomNumber(100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numberArray[i]);
        }

        // Linked List
        System.out.println("Linked List");
        LinkedList<Integer> ll = new LinkedList();    // create empty list
        for (int i = 0; i < 10; i++) {
            ll.add(randomNumber(100));  // append to the list
        }
        for (Integer num : ll) {    // for each node in the list
            System.out.println(num);            
        }
        System.out.println(
            "Does the list contain 50? " + 
            (ll.contains(50) ? "Yes" : "No"));
        System.out.println("The element at index 5 is " + ll.get(5));

        // Array List
        System.out.println("Array List");
        ArrayList<Integer> al = new ArrayList();
        for (int i = 0; i < 10; i++) {
            al.add(randomNumber(100));  // append to the list
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(al.get(i));            
        }
        System.out.println(
            "Does the array list contain 50? " + 
            (al.contains(50) ? "Yes" : "No"));

        // Hash Map
        System.out.println("Hash Map");
        HashMap<String,Integer> hm = new HashMap();
        hm.put("Mary", 10);
        hm.put("Paul", 12);
        hm.put("David", 9);
        hm.put("Peter", 7);

        System.out.println(hm.get("Mary"));
        System.out.println(hm.get("David"));
        System.out.println(hm.get("Oscar"));
        System.out.println(
            "Does the hash map contain Peter? " + 
            (hm.containsKey("Peter") ? "Yes" : "No"));
        for (String name : hm.keySet()) {
            System.out.println(name + " is " + hm.get(name) + " years old");            
        }
    }

    private static int randomNumber(int max) {
        Random rand = new Random();
        int rn = rand.nextInt();
        int absRN = Math.abs(rn);
        int randNum = absRN % max;
        return randNum;
    }    
}
