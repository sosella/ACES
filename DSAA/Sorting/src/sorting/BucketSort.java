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
public class BucketSort implements ISort
{
    @Override
    public void sort(int[] arr) {
        if (arr.length == 0) return;
        
        int max = findMaximumNumber(arr);
        int[] fullArr = new int[max+1];
        for (int i = 0; i <= max; i++) {
            fullArr[i] = 0;
        }
        
        for (int i = 0; i < arr.length; i++) {
            fullArr[arr[i]]++;
        }
        
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            if (fullArr[i] != 0) {
                for (int n = 0; n < fullArr[i]; n++) {
                    arr[idx++] = i;
                }
            }
        }
    }    

    private int findMaximumNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
