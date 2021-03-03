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
 * SortableDouble is the double equivalent of a SortableObject
 */
public class SortableDouble extends SortableObject<SortableDouble>{
    
    public double d;
    
    public SortableDouble(double _d){
        this.d = _d;
    }
    /**
     * Compares this object with object 'o' 
     * 
     * 
     * @param o The object to be compared with the calling object
     * @return returns a negative integer, zero, or positive integer
     * as this object is less than, equal to, or greater than the specified
     * object.
     */
    @Override
    public int compareTo(SortableDouble o) {
        return Double.compare(this.d, o.d);
    }
    /**
     * Returns a string representation of this object.
     * 
     * @return A string representation of this object.
     */
    @Override
    public String toString(){
        return "" + this.d;
    }
    /**
    * Returns a boolean representing whether the objects are equal to one another 
    * Overrides Object.equals() so JUnit can use Assert.Equals to check if the 
    * objects values are the same, rather than checking if the objects are the same.
    * 
    * @param obj the object to be compared with the calling object
    * @return a boolean representing whether the objects are equal to one another
    */
    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
