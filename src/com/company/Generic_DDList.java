package com.company;

public class Generic_DDList<Genric> {
    public class IntNode {

        public IntNode prev;
        public Genric item;
        public IntNode next;


        public IntNode(IntNode p, Genric i, IntNode n) {
            prev = p;
            item = i;
            next = n;
        }
    }

    private IntNode sentimnel;
    private int size;

    public Generic_DDList() {
        sentimnel = new IntNode(null, null, null);
        size = 0;
    }

    public  Generic_DDList(Genric x){
        sentimnel = new IntNode(null, null, null);
        sentimnel.next = new IntNode(sentimnel, x, sentimnel);
        sentimnel.prev = sentimnel.next;
        size = 1;
    }

    public void addFirst(Genric x){
        size++;
        sentimnel.next = new IntNode(sentimnel, x, sentimnel.next);
        sentimnel.next.next.prev = sentimnel.next;
    }

    public void addLast(Genric x){
        if(size == 0){
            sentimnel.next = new IntNode(sentimnel, x, sentimnel);
            sentimnel.prev = sentimnel.next;
        }else{
            sentimnel.prev.next = new IntNode(sentimnel.prev, x, sentimnel);
            sentimnel.prev = sentimnel.prev.next;
        }
    }

    public  static void main(String [] args){
        Generic_DDList <String> l = new Generic_DDList<String>("b");
        l.addFirst("a");
        l.addLast("c");
    }
}