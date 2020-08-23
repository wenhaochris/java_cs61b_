package com.company;

public class SLList {
    public static class IntNode{
        public int item;
        public IntNode next;
        public  IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }
    private IntNode first;
    private IntNode sentinel;




    public SLList(int x){
        first = new IntNode(x, null);
    }


    public void addFrisrt(int x){
        first = new IntNode(x, first);
    }

    public int getFirst(){
        return first.item;
    }

    public  void addLast(int x){
        if( first == null){
            first = new IntNode(x, null);
            return;
        }
        IntNode p = first;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    private int size(IntNode p) {
        if(p.next == null)
            return 1;
        return 1+size(p.next);
    }

    public int size(){
        return size(first);
    }



    public static void main(String[] args){
        SLList L = new SLList(5);
        L.addFrisrt(10);
        L.addFrisrt(14);
        L.addLast(66);
        int x = L.getFirst();
        System.out.println("size is" + L.size());
        while(L.first !=  null){
            System.out.println(L.first.item);
            L.first = L.first.next;
        }

    }

}
