/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Sortables;

/**
 *
 * @author Caleb
 */
public abstract class SortableObject<T> {
    /**
     * Should function similarly to Comparable.compareTo();
     * 
     * Compares this object with object 'o' 
     * 
     * @param o The object to be compared
     * @return returns a negative integer, zero, or positive integer
     * as this object is less than, equal to, or greater than the specified
     * object.
     */
    public abstract int compareTo(T o);
    
    /**
     * Returns a string representation of this object.
     * 
     * @return A string representation of this object.
     */
    @Override
    public abstract String toString();
    
}
