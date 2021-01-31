/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Sortables;

/**
 *
 * @author Caleb
 * 
 * The purpose of SortableObject is to allow the same sorting methods to be able
 * to sort any user defined object that extends SortableObject
 */
public abstract class SortableObject<T> {
    /**
     * Should function similarly to Comparable.compareTo();
     * 
     * Compares this object with object 'o' 
     * 
     * @param o The object to be compared with the calling object
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
    
    /**
    * Returns a boolean representing whether the objects are equal to one another 
    * Overrides Object.equals() so JUnit can use Assert.Equals to check if the 
    * objects values are the same, rather than checking if the objects are the same.
    * 
    * @return a boolean representing whether the objects are equal to one another
    */
    @Override
    public abstract boolean equals(Object obj);
    
}
