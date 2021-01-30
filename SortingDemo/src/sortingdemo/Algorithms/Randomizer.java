/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Algorithms;

import java.util.ArrayList;
import java.util.Random;
import sortingdemo.Sortables.SortableObject;


/**
 *
 * @author Caleb
 */
public class Randomizer {
    
    private static Random random = new Random();
    
    public static void randomize(Object[] arr){
        int location;
        Object temp;
        for(int i = 0; i < arr.length; i++){
            location = i;
            while(location == i){
                location = random.nextInt(arr.length);
            }
            temp = arr[location];
            arr[location] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static ArrayList<SortableObject> randomize(ArrayList<SortableObject > arr){
        int location;
        SortableObject temp;
        for(int i = 0; i < arr.size(); i++){
            location = i;
            while(location == i){
                location = random.nextInt(arr.size());
            }
            temp = arr.get(location);
            arr.set(location,arr.get(i));
            arr.set(i, temp);
        }
        return arr;
    }
}
