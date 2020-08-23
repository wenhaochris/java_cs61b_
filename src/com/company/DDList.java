package com.company;

public class DDList {
    public  class IntNode{


        public int item;
        public IntNode prev;
        public IntNode next;

        public IntNode(int i, IntNode p, IntNode n){
            item = i;
            prev = p;
            next = n;
        }

    }

    private IntNode sentinel;
    private IntNode last;
    private int size;

    public DDList(){
        sentinel = new IntNode(63, null, null);
        sentinel.next = new IntNode(64, sentinel,null);
        last = sentinel.next;
        size = 0;
    }

    public  DDList(int x){
        sentinel = new IntNode(63, null, null);
        size++;
        last = new IntNode(64, null, null);
        sentinel.next = new IntNode(x, sentinel,last);
    }

    public void addFirst(int x){
        size++;
        sentinel.next = new IntNode(x,sentinel,sentinel.next);
    }

    public  void addLast(int x){
        size++;
        last.prev = new IntNode(x, last.prev, last);
    }
    
}

