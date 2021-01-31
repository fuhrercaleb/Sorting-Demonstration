/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Algorithms;

import java.util.ArrayList;
import sortingdemo.Sortables.SortableObject;

/**
 * Bubble sort is a simple sorting algorithm that functions by swapping adjacent
 * elements in a series of passes, until no swaps are performed
 * 
 * 
 * @author Caleb
 */
public class BubbleSort {
    /**
     * This method sorts the array using the Bubble Sort algorithm
     * 
     * @param arr The array to be sorted 
     */
    public static void sort(SortableObject[] arr){
        int swaps = 1; // Starts at 1 swap so while loop isn't passed
        while(swaps > 0){ // Stops passes if no swaps are completed
            swaps = 0;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i].compareTo(arr[i+1]) > 0){
                    swap(arr,i,i+1);
                    swaps++;
                }
            }
        }
    }
    
    /**
     * Swaps the position of the items at index1 and index 2 in the array arr
     * 
     * @param arr the array to be swapped 
     * @param index1 first index to swap
     * @param index2 second index to swap
     */
    private static void swap(SortableObject[] arr, int index1, int index2 ){
        SortableObject temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    /**
     * This method sorts an arrayList using the Bubble Sort algorithm
     * 
     * @param arr The arrayList to be sorted 
     */
    public static void sort(ArrayList<SortableObject> arr){
        int swaps = 1; // Starts at 1 swap so while loop isn't passed
        while(swaps > 0){ // Stops passes if no swaps are completed
            swaps = 0;
            for(int i = 0; i < arr.size() - 1; i++){
                if(arr.get(i).compareTo(arr.get(i + 1)) > 0){
                    swap(arr,i,i+1);
                    swaps++;
                }
            }
        }
    }
    
    /**
     * Swaps the position of the items at index1 and index 2 in the arrayList arr
     * 
     * @param arr the arrayList to be swapped 
     * @param index1 first index to swap
     * @param index2 second index to swap
     */
    private static void swap(ArrayList<SortableObject> arr, int index1, int index2 ){
        SortableObject temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }
    
}
