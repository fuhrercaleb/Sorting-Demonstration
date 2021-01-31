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
 * SortableInt is the int equivalent of a SortableObject
 */
public class SortableInt extends SortableObject<SortableInt>{
    
    public int i;
    
    public SortableInt(int _i){
        this.i = _i;
    }
    /**
     * Compares this object with object 'o' 
     * 
     * function changed to more closely emulate Integer.compareTo and prevent
     * integer overflow.
     * 
     * @param o The object to be compared with the calling object
     * @return returns a negative integer, zero, or positive integer
     * as this object is less than, equal to, or greater than the specified
     * object.
     */
    @Override
    public int compareTo(SortableInt o) {
        return (i<o.i ? -1 : (i==o.i ? 0 : 1));
    }
    /**
     * Returns a string representation of this object.
     * 
     * @return A string representation of this object.
     */
    @Override
    public String toString(){
        return "" + this.i;
    }
    /**
    * Returns a boolean representing whether the objects are equal to one another 
    * Overrides Object.equals() so JUnit can use Assert.Equals to check if the 
    * objects values are the same, rather than checking if the objects are the same.
    * 
    * @return a boolean representing whether the objects are equal to one another
    */
    @Override
    public boolean equals(Object obj){
        SortableInt a = (SortableInt)obj;
        return this.i == a.i;
    }
}
