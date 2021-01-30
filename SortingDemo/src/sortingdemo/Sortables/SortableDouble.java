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
public class SortableDouble extends SortableObject<SortableDouble>{
    
    public double d;
    
    public SortableDouble(double _d){
        this.d = _d;
    }

    @Override
    public int compareTo(SortableDouble o) {
        return Double.compare(this.d, o.d);
    }

    @Override
    public String toString(){
        return "" + this.d;
    }
}
