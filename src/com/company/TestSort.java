package com.company;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSort {
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }
    @Test
    public  void testFindSmallest(){
        String [] input = {"i", "have", "an", "egg"};
        int  expected = 2;

        int actual = Sort.findSmallest(input, 2);
        org.junit.Assert.assertEquals(expected, actual);
    }
    @Test
    public  void testSwap(){
        String [] input = {"i", "have", "an", "egg"};
        String [] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, 0, 2);
        org.junit.Assert.assertEquals(expected, input);
    }


}
