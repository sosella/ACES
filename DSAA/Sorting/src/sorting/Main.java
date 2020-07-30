/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

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
        //sort(new BucketSort());
        sort(new QuickSort());
        sort(new MergeSort());
        sort(new BubbleSort());
        sort(new SelectionSort());
        sort(new InsertionSort());
    }    

    private static void sort(ISort sorter)
    {
        //int arr[] = {21, 3, 13, 2, 8, 34, 1, 5};
        int arr[] = getArray(10000);
        System.out.println(sorter.getClass().getName());
        //printArray(arr);
        Date start = new Date();
        sorter.sort(arr); 
        Date end = new Date();
        //printArray(arr);
        System.out.println("Total time = " + (end.getTime() - start.getTime()));
    }

    private static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] getArray(int num) {
        int arr[] = new int[num];
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = Math.abs(rand.nextInt());
        }
        return arr;
    }
}
