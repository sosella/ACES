/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author steph
 */
public class SelectionSort implements ISort
{
    @Override
    public void sort(int[] arr)
    {
        int n = arr.length;
        int nminus1 = n - 1;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < nminus1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }    
}