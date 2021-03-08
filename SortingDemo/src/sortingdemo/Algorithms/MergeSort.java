/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Algorithms;

import java.util.ArrayList;
import sortingdemo.Sortables.SortableObject;

/**
 * Merge sort is a more complex sorting algorithm that uses a recursive method
 * to split the array in half repeatedly until each half the a split array is
 * of size one or zero then sorts the two halves when merging them back together
 * 
 * @author caleb
 */
public class MergeSort {
    /**
     * The main recursive sorting method using the Merge Sorting algorithm.
     * 
     * @param arr The array to be sorted
     * @param n the number of elements in the array 
     */
    public static void sort(SortableObject[] arr, int n){
        // If the portion to be sorted is one or less, then nothing needs to be done 
        if(n < 2){ 
            return;
        }
        //finds the middle of the array
        int mid = n/2;
        // initialized an array to contain the elements on the left side of the array `arr`
        SortableObject[] left = new SortableObject[mid];
        // initialized an array to contain the elements on the right side of the array `arr`
        SortableObject[] right = new SortableObject[n-mid];
        // filling the left array
        System.arraycopy(arr, 0, left, 0, mid);
        // filling the right array
        System.arraycopy(arr, mid, right, 0, n - mid);
        // Sort the two halves of the array recursively.
        sort(left, mid);
        sort(right, n - mid);
        // a healper method is used to merge the to halves together in sorted order
        merge(arr, left, right, mid, n - mid);
    }
    
    /**
     * The helper method to MergeSort.sort() takes the sorted `left` and `right` 
     * arrays and merge them into the main array `arr`
     * 
     * @param arr the main array being sorted 
     * @param left the sorted left portion of the array
     * @param right the sorted right portion of the array
     * @param leftSize the size of the left portion of the array
     * @param rightSize  the size of the right portion of the array
     */
    private static void merge(SortableObject[] arr, SortableObject[] left,
            SortableObject[] right, int leftSize, int rightSize){
        
        int leftIndex = 0; // Used to index the left array
        int rightIndex = 0; // Used to index the right array
        int arrayIndex = 0; // Used to index the primary array
        
        /*
        * While there are objects in both arrays this selction of code will 
        * sort and merge the left and right array together, if the precondition
        * that both the left array and right array are sorted.
        */
        while(leftIndex < leftSize && rightIndex < rightSize){
            if(left[leftIndex].compareTo(right[rightIndex]) <= 0){
                arr[arrayIndex++] = left[leftIndex++];
            }else{
                arr[arrayIndex++] = right[rightIndex++];
            }
        }
        /*
        * Fills the rest of the array with the remaining sorted elements in the
        * left array
        */
        while(leftIndex < leftSize){
            arr[arrayIndex++] = left[leftIndex++];
        }
        /*
        * Fills the rest of the array with the remaining sorted elements in the
        * right array
        */
        while(rightIndex < rightSize){
            arr[arrayIndex++] = right[rightIndex++];
        }
    }
    
    /**
     * The main recursive sorting method using the Merge Sorting algorithm.
     * 
     * @param arr The arrayList to be sorted
     * @param n the number of elements in the arrayList
     */
    public static void sort(ArrayList<SortableObject> arr, int n){
        // If the portion to be sorted is one or less, then nothing needs to be done 
        if(n < 2){ 
            return;
        }
        //finds the middle of the array
        int mid = n/2;
        // initialized an array to contain the elements on the left side of the array `arr`
        ArrayList<SortableObject> left = new ArrayList<>();
        // initialized an array to contain the elements on the right side of the array `arr`
        ArrayList<SortableObject> right = new ArrayList<>();
        // filling the left array
        //System.arraycopy(arr, 0, left, 0, mid);
        left.addAll(arr.subList(0, mid));
        // filling the right array
        //System.arraycopy(arr, mid, right, 0, n - mid);
        right.addAll(arr.subList(mid, n));
        // Sort the two halves of the array recursively.
        sort(left, mid);
        sort(right, n - mid);
        // a healper method is used to merge the to halves together in sorted order
        merge(arr, left, right, mid, n - mid);
    }
    
    /**
     * The helper method to MergeSort.sort() takes the sorted `left` and `right` 
     * arrayLists and merge them into the main arrayList `arr`
     * 
     * @param arr the main arrayList being sorted 
     * @param left the sorted left portion of the arrayList
     * @param right the sorted right portion of the arrayList
     * @param leftSize the size of the left portion of the arrayList
     * @param rightSize  the size of the right portion of the arrayList
     */
    private static void merge(ArrayList<SortableObject> arr, 
            ArrayList<SortableObject> left, ArrayList<SortableObject> right,
            int leftSize, int rightSize){
        
        int leftIndex = 0; // Used to index the left arrayList
        int rightIndex = 0; // Used to index the right arrayList
        int arrayIndex = 0; // Used to index the primary arrayList
        
        /*
        * While there are objects in both arrayLists this selction of code will 
        * sort and merge the left and right arrayLists together, if the 
        * precondition that both the left arrayList and right arrayList are 
        * sorted.
        */
        while(leftIndex < leftSize && rightIndex < rightSize){
            if(left.get(leftIndex).compareTo(right.get(rightIndex)) <= 0){
                arr.set(arrayIndex++,left.get(leftIndex++));
            }else{
                arr.set(arrayIndex++,right.get(rightIndex++));
            }
        }
        /*
        * Fills the rest of the arrayList with the remaining sorted elements in 
        * the left arrayList
        */
        while(leftIndex < leftSize){
            arr.set(arrayIndex++,left.get(leftIndex++));
        }
        /*
        * Fills the rest of the arrayList with the remaining sorted elements in 
        * the right arrayList
        */
        while(rightIndex < rightSize){
            arr.set(arrayIndex++,right.get(rightIndex++));
        }
    }
}
