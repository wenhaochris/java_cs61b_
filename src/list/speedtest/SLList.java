package list.speedtest;

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

    public int size(){
        return size;
    }
    public static void main(String[] args){
        SLList<Integer> L = new SLList<>();
    }
}
