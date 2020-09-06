package Interface;

public class RotatingSLList<Item> extends SLList<Item> {
    public void rotateRight(){
           Item temp = removeLast();
           addFirst(temp);
    }
    public  static void main(String[] args){
        RotatingSLList A= new RotatingSLList();
        A.addLast(11);
        A.addLast(12);
        A.addLast(13);
        A.addLast(14);

        A.print();
        A.rotateRight();
        A.print();
    }
}
