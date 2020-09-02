package list.speedtest;

import java.util.Objects;

public class AList<Item> {
    private Item[] items;
    private int size;

    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }
    private  void resize(int capacity){
        Item [] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void insert(Item x, int position){
        Item [] result = (Item[]) new Objects[items.length];
        for(int i = 1; i < position + 1; i++){
            result[i] = items[i];
        }
        result[position + 1] = x;
        for(int i = position + 2; i < items.length;i++){
            result[i] = items[i];
        }
        items = result;
    }

    public Item getFirst(){
      if(size == 0)
          return null;
        return items[1];
    }

    public void addFirst(Item x){
        if(size == items.length)
            resize(size + 100);
        for(int i = size + 1; i> 1; i -- ){
            items[i] = items[i - 1];
        }
        items[1] = x;
    }


    public  void addLast(Item x){
        if(size == items.length){
            resize(size + 100);
        }

        items[size ] = x;
        size++;
    }

    public Item getLast(){
        return items[size - 1];
    }

    public Item get(int i){
        return items[i];
    }

    public int size(){
        return size;
    }

    public Item removeLast(){
        Item x = getLast();
        size = size - 1;
        return  x;
    }

}
