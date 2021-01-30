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
public class SortableInt extends SortableObject<SortableInt>{
    
    public int i;
    
    public SortableInt(int _i){
        this.i = _i;
    }

    @Override
    public int compareTo(SortableInt o) {
        return (i<o.i ? -1 : (i==o.i ? 0 : 1)); //Changed from `return this.i - o.i`
        /*
        * Changed to look more like Integer.compareTo to fix integer overflow
        */
    }

    @Override
    public String toString(){
        return "" + this.i;
    }
    
    @Override
    public boolean equals(Object obj){
        SortableInt a = (SortableInt)obj;
        return this.i == a.i;
    }
}
