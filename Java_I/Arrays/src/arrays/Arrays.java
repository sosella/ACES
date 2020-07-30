/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author steph
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The length of the array cannot be changed after creation
        // Indexs are zero-based
        // Set by initializers
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        // Print the value of the element at index 0
        System.out.println(myList[0]);
        // Print the value of the element at index 1
        System.out.println(myList[1]);
        // Print the value of the element at index 2
        System.out.println(myList[2]);
        // Print the value of the element at index 3
        System.out.println(myList[3]);
        //System.out.println(myList[4]); generates runtime error
        //System.out.println(myList[-1]); generates runtime error
        // Change the value of the element at index 0
        myList[0] = 2.1;
        System.out.println(myList[0]);

        // Create another array
        // Specify the size (which cannot be changed)
        // Default value of all the elements is 0.0
        double[] myList2 = new double[4];
        System.out.println(myList2.length);
        myList2[2] = 1.9;
        System.out.println(myList2[0]);
        System.out.println(myList2[1]);
        System.out.println(myList2[2]);
        System.out.println(myList2[3]);
    }
}
