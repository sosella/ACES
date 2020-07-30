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
public class BubbleSort implements ISort
{
    @Override
    public void sort(int[] arr)
    {
        int nminus1 = arr.length - 1;
        int nminus1minusi = nminus1;
        for (int i = 0; i < nminus1; i++, nminus1minusi--)
        {
            for (int j = 0, jplus1 = 1; j < nminus1minusi; j++, jplus1++)
            {
                if (arr[j] > arr[jplus1])
                {
                    int temp = arr[j];
                    arr[j] = arr[jplus1];
                    arr[jplus1] = temp;
                }
            }
        }
    }    
}
