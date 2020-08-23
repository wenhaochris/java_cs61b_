package com.company;

public class MAX_Array {
    public  static int max(int [] m){
        int max = 0;
        for(int i = 0; i < m.length; i++){
            if(m[i] > max){
                max = m[i];
            }
        }
        return max;
    }
    public  static int max_w(int  []m){
        int i = 0;
        int max = 0;
        while( i <  m.length){
            if(max < m[i]){
                max = m[i];
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max_w(numbers));
    }
}
