package com.company;

public class IntList {
    public int first;
    public IntList rest;

    public  IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    // return the size of the list using ... recursion
    public int size(){
       if(rest == null)
           return 1;
       return 1 + rest.size();
    }
    //return the size of the list using ... no recursion
    public int iterativeSize(){
        IntList p = this;
        int total = 0;
        while(p != null){
            total++;
            p = p.rest;
        }
        return total;
    }

    public int get(int i){
        if(i == 0)
            return first;
        return rest.get(i-1);
    }

}
