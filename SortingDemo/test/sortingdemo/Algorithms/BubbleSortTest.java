/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Algorithms;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sortingdemo.Sortables.SortableInt;
import sortingdemo.Sortables.SortableObject;

/**
 *
 * @author Caleb
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test1 of sort method, of class BubbleSort.
     * This test sets out to prove that BubbleSort.sort() is capable of 
     * handling arrays of size 0
     */
    @Test
    public void testSort1() {
        SortableObject[] testArr1 = {};
        SortableObject[] testResult1 = {};
        BubbleSort.sort(testArr1);
        Assert.assertArrayEquals(testResult1,testArr1);
    }
    /**
     * Test2 of sort method, of class BubbleSort.
     * This test sets out to prove that BubbleSort.sort() is capable of 
     * handling arrays of size 1
     */
    @Test
    public void testSort2() {
        SortableObject[] testArr2 = {new SortableInt(1)};
        SortableObject[] testResult2 = {new SortableInt(1)};
        BubbleSort.sort(testArr2);
        Assert.assertArrayEquals(testResult2,testArr2);
    }
    /**
     * Test3 of sort method, of class BubbleSort.
     * This test sets out to prove that BubbleSort.sort() functions properly
     */
    @Test
    public void testSort3() {
        SortableObject[] testArr3 = {new SortableInt(3),new SortableInt(1),new SortableInt(5)};
        SortableObject[] testResult3 = {new SortableInt(1),new SortableInt(3),new SortableInt(5)}; 
        BubbleSort.sort(testArr3);
        Assert.assertArrayEquals(testResult3,testArr3);
    }
    /**
     * Test4 of sort method, of class BubbleSort.
     * This test sets out to prove that BubbleSort.sort() functions properly
     * while handling negative numbers
     */
    @Test
    public void testSort4() {
        SortableObject[] testArr4 = {new SortableInt(3),new SortableInt(1),new SortableInt(-1),new SortableInt(5)};
        SortableObject[] testResult4 = {new SortableInt(-1),new SortableInt(1),new SortableInt(3),new SortableInt(5)}; 
        BubbleSort.sort(testArr4);
        Assert.assertArrayEquals(testResult4,testArr4);
    }
    /**
     * Test5 of sort method, of class BubbleSort.
     * This test sets out to prove that BubbleSort.sort() functions properly
     * while handling Integer.MIN_VALUE and Integer.MAX_VALUE 
     */
    @Test
    public void testSort5() {
        SortableObject[] testArr5 = {new SortableInt(3),new SortableInt(1),new SortableInt(-1),new SortableInt(5),new SortableInt(Integer.MIN_VALUE),new SortableInt(Integer.MAX_VALUE)};
        SortableObject[] testResult5 = {new SortableInt(Integer.MIN_VALUE),new SortableInt(-1),new SortableInt(1),new SortableInt(3),new SortableInt(5),new SortableInt(Integer.MAX_VALUE)}; 
        BubbleSort.sort(testArr5);
        System.out.println(Arrays.toString(testArr5));
        Assert.assertArrayEquals(testResult5,testArr5);
    }
}
