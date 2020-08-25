package com.company;

public class Sort {
    public static void sort(String[]  x){
//        find the smallest item
//        move it to the front
//        selection sort the rest(using recursion ?)
//        int smallest = findSmallest(x);
//        swap(x, 0 ,smallest);
//        sort(x[1 : ]);
        sort(x, 0);
    }

    private static void  sort(String[] x, int start){
        if(start == x.length){
            return;
        }
        int smallest = findSmallest(x, start);
        swap(x, start, smallest);
        sort(x, start + 1);
    }


    public  static int findSmallest(String[] x, int start){
        int smallIndex = start;
        for(int i = start; i < x.length; i++){
            int cmp = x[i].compareTo(x[smallIndex]);  // if x[i] less than x[smallIndex] return -1
            if(cmp < 0){
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public  static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
