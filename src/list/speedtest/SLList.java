package list.speedtest;

import com.company.Generic_DDList;

public class SLList <Blah>{
    private class StuffNode{
            public  Blah item;
            public  StuffNode next;

            public  StuffNode(Blah i, StuffNode n){
                item = i;
                next = n;
            }
    }

    private StuffNode sentinel;
    private int size;

    public SLList(){
        sentinel = new StuffNode(null, null);
        size = 0;
    }

    public  SLList(Blah x){
        sentinel = new StuffNode(null, null);
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }

    public void addFirst(Blah x){
        sentinel.next = new StuffNode(x, sentinel.next);
        size++;
    }

    public Blah getFirst(){
        return sentinel.next.item;
    }

    public  void addLast(Blah x){
        size++;
        StuffNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }

        p.next = new StuffNode(x, null);
    }

    public Blah getLast(){
        StuffNode p = sentinel;
        while (p.next != null){
            p = p.next;
        }

        Blah ans = p.item;
        return ans;
    }

    public Blah get(int n){
        if(n > size){
            return null;
        }
        Blah ans = null;
        StuffNode p = sentinel.next;
        for(int i = n; i >= 0; i--){
            ans = p.item;
            p = p.next;
        }
        return ans;
    }


    public Blah getRecursion(int i){
        return getRecursion(i, sentinel);
    }

    public Blah getRecursion(int i, StuffNode sentinel){
        if( i== 0)
            return sentinel.item;
        return getRecursion(i-1, sentinel.next);
    }

    public int size(){
        return size;
    }
    public Blah removeLast(){
        StuffNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        Blah ans = p.item;
        p.next = null;
        return ans;

    }
    public  void insert(Blah item, int position){
            if(sentinel.next == null && position == 0) {
                addFirst(item);
                return;
            }
            StuffNode p = sentinel.next;
            while(position > 1 && p.next != null){
                position--;
                p = p.next;
            }
            StuffNode node = new StuffNode(item, p.next);
            p.next = node;

    }

    public static String longest(SLList<String> list){
        int maxDex = 0;
        for(int i = 0; i < list.size; i++){
            if(list.get(i).length() > list.get(maxDex).length()){
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }
    public static void main(String[] args){
        SLList<String> someList = new SLList<>();
        someList.addLast("elk");
        someList.addLast("are");
        someList.addLast("watching");
        System.out.println(longest(someList));
    }
}
