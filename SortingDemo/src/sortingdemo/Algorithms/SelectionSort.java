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

// Done Incorectly


public class SelectionSort {
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
    
    private static void swap(SortableObject[] _arr, int index1, int index2 ){
        SortableObject temp = _arr[index1];
        _arr[index1] = _arr[index2];
        _arr[index2] = temp;
    }
}
