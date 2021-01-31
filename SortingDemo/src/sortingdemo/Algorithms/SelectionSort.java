/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Algorithms;

import java.util.Arrays;
import sortingdemo.Sortables.SortableObject;

/**
 *
 * @author Caleb
 */



public class SelectionSort {
    
    /**
    * This method sorts the array using the Selection Sort algorithm
    * 
    * @param arr The array to be sorted 
    */
    public static void sort(SortableObject[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min_index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j].compareTo(arr[min_index]) < 0)
                    min_index = j;
            }
            swap(arr,i, min_index);
        }
    }
    
    /**
     * Swaps the position of the items at index1 and index 2 in the array arr
     * 
     * @param arr the array to be swapped 
     * @param index1 first index to swap
     * @param index2 second index to swap
     */
    private static void swap(SortableObject[] _arr, int index1, int index2 ){
        SortableObject temp = _arr[index1];
        _arr[index1] = _arr[index2];
        _arr[index2] = temp;
    }
}
