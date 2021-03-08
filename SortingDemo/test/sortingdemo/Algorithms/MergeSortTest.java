/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sortingdemo.Sortables.SortableInt;
import sortingdemo.Sortables.SortableObject;

/**
 *
 * @author caleb
 */
public class MergeSortTest {
    
    public MergeSortTest() {
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
     * Test1 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() is capable of 
     * handling arrays of size 0
     */
    @Test
    public void testSort1() {
        SortableObject[] testArr1 = {};
        SortableObject[] testResult1 = {};
        MergeSort.sort(testArr1,0);
        Assert.assertArrayEquals(testResult1,testArr1);
    }
    
    /**
     * Test2 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() is capable of 
     * handling arrays of size 1
     */
    @Test
    public void testSort2() {
        SortableObject[] testArr2 = {new SortableInt(1)};
        SortableObject[] testResult2 = {new SortableInt(1)};
        MergeSort.sort(testArr2,1);
        Assert.assertArrayEquals(testResult2,testArr2);
    }
    /**
     * Test3 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() functions properly
     */
    @Test
    public void testSort3() {
        SortableObject[] testArr3 = {new SortableInt(3),new SortableInt(1),new SortableInt(5)};
        SortableObject[] testResult3 = {new SortableInt(1),new SortableInt(3),new SortableInt(5)}; 
        MergeSort.sort(testArr3,3);
        Assert.assertArrayEquals(testResult3,testArr3);
    }
    /**
     * Test4 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() functions properly
     * while handling negative numbers
     */
    @Test
    public void testSort4() {
        SortableObject[] testArr4 = {new SortableInt(3),new SortableInt(1),new SortableInt(-1),new SortableInt(5)};
        SortableObject[] testResult4 = {new SortableInt(-1),new SortableInt(1),new SortableInt(3),new SortableInt(5)}; 
        MergeSort.sort(testArr4,4);
        Assert.assertArrayEquals(testResult4,testArr4);
    }
    /**
     * Test5 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() functions properly
     * while handling Integer.MIN_VALUE and Integer.MAX_VALUE 
     */
    @Test
    public void testSort5() {
        SortableObject[] testArr5 = {new SortableInt(3),new SortableInt(1),new SortableInt(-1),new SortableInt(5),new SortableInt(Integer.MIN_VALUE),new SortableInt(Integer.MAX_VALUE)};
        SortableObject[] testResult5 = {new SortableInt(Integer.MIN_VALUE),new SortableInt(-1),new SortableInt(1),new SortableInt(3),new SortableInt(5),new SortableInt(Integer.MAX_VALUE)}; 
        MergeSort.sort(testArr5,6);
        Assert.assertArrayEquals(testResult5,testArr5);
    }
    
    /**
     * Test6 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() is capable of 
     * handling an arrayList of size 0
     */
    @Test
    public void testSort6() {
        ArrayList<SortableObject> testArr1 = new ArrayList<>();
        ArrayList<SortableObject> testResult1 = new ArrayList<>();
        MergeSort.sort(testArr1,0);
        Assert.assertEquals(testResult1,testArr1);
    }
    /**
     * Test7 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() is capable of 
     * handling an arrayList of size 1
     */
    @Test
    public void testSort7() {
        ArrayList<SortableObject> testArr2 = new ArrayList<>();
        testArr2.add(new SortableInt(1));
        ArrayList<SortableObject> testResult2 = new ArrayList<>();
        testResult2.add(new SortableInt(1));
        MergeSort.sort(testArr2,1);
        Assert.assertEquals(testResult2,testArr2);
    }
    /**
     * Test8 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() functions properly
     */
    @Test
    public void testSort8() {
        ArrayList<SortableObject> testArr3 = new ArrayList<>();
        testArr3.addAll(Arrays.asList(new SortableInt(3),new SortableInt(1),new SortableInt(5)));
        ArrayList<SortableObject> testResult3 = new ArrayList<>();
        testResult3.addAll(Arrays.asList(new SortableInt(1),new SortableInt(3),new SortableInt(5)));
        MergeSort.sort(testArr3,3);
        Assert.assertEquals(testResult3,testArr3);
    }
    /**
     * Test9 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() functions properly
     * while handling negative numbers
     */
    @Test
    public void testSort9() {
        ArrayList<SortableObject> testArr4 = new ArrayList<>();
        testArr4.addAll(Arrays.asList(new SortableInt(3),new SortableInt(1),new SortableInt(-1),new SortableInt(5)));
        ArrayList<SortableObject> testResult4 = new ArrayList<>();
        testResult4.addAll(Arrays.asList(new SortableInt(-1),new SortableInt(1),new SortableInt(3),new SortableInt(5)));
        MergeSort.sort(testArr4,4);
        Assert.assertEquals(testResult4,testArr4);
    }
    /**
     * Test10 of sort method, of class MergeSort.
     * This test sets out to prove that MergeSort.sort() functions properly
     * while handling Integer.MIN_VALUE and Integer.MAX_VALUE 
     */
    @Test
    public void testSort10() {
        ArrayList<SortableObject> testArr5 = new ArrayList<>();
        testArr5.addAll(Arrays.asList(new SortableInt(3),new SortableInt(1),new SortableInt(-1),new SortableInt(5),new SortableInt(Integer.MIN_VALUE),new SortableInt(Integer.MAX_VALUE)));
        ArrayList<SortableObject> testResult5 = new ArrayList<>();
        testResult5.addAll(Arrays.asList(new SortableInt(Integer.MIN_VALUE),new SortableInt(-1),new SortableInt(1),new SortableInt(3),new SortableInt(5),new SortableInt(Integer.MAX_VALUE)));
        MergeSort.sort(testArr5,6);
        Assert.assertEquals(testResult5,testArr5);
    }
}
