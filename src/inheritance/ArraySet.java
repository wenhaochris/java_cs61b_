package inheritance;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size;
    public ArraySet(){
        items = (T[]) new Object[100];
        size = 0;

    }
    /* return true if this map contains a mapping for the specified key */
    public boolean contains(T x){
            for(int i = 0; i < size; i++){
                if(items[i] == null ){
                    if(x == null)
                        return true;
                }
                if(items[i].equals(x))
                    return true;
            }
            return false;
    }



    /* Associates  the specified value with the specified key in this map. Throw an illegalArgumentException if the key
    is null*/

    public void add(T x){
//        if(x == null){
//            throw new IllegalArgumentException(" can't add null");
//        }
        if(contains(x)){
            return;
        }
        if(!contains(x)){
            items[size] = x;
            size ++;
        }
    }
    /* return the number of key-value mapping in this map*/


    public  int size(){
        return size;
    }

    /*return an iterator  */
    public  Iterator<T> iterator(){
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T>{
        private int wizPos;
        public ArraySetIterator(){
            wizPos = 0;
        }

        public boolean hasNext(){
            return wizPos < size;
        }

        public T next(){
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }

    @Override
    public String toString(){
       StringBuilder returnSb = new StringBuilder("{");
        for(int i = 0; i < size - 1; i++){
            returnSb.append(items[i]);
            returnSb.append(",");
        }
        returnSb.append(items[size-1]);
        returnSb.append( "}" );
        return returnSb.toString();
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(other == null){
            return false;
        }
        if(other.getClass() != this.getClass()){
            return false;
        }

        ArraySet<T> o = (ArraySet<T>) other;
        if(this.size() != o.size()){
            return false;
        }
        for(T item : this){
            if(!o.contains(item)){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args){
//        Set<String> s1 = new HashSet<>();
//        s1.add("horse");
//        s1.add("fish");
//        s1.add("house");
//        Iterator<String> seer = s1.iterator();
//        while (seer.hasNext()){
//            System.out.println(seer.next());
//        }
//        System.out.println(s1.toString());


        ArraySet<String> s = new ArraySet<>();
//        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
//
//        for(String a : s){
//            System.out.println(a);
//        }
        System.out.println(s);
//        Iterator<String> aseer = s.iterator();
//        while(aseer.hasNext()){
//            System.out.println(aseer.next());
//        }
    }
}
