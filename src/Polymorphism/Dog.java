package Polymorphism;

public class Dog implements Comparable<Dog> {
    public String name;
    private  int size;

    public Dog(String n, int s){
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

//    public int compareTo(Dog uddaDog){
//
////        if(this.size > indadaDog.size){
////            return 1;
////        }else if(this.size == indadaDog.size){
////            return 0;
////        }else{
////            return -1;
////        }
//        return this.size - uddaDog.size;
//    }
    @Override
   public int compareTo(Dog uddaDog){
        return size - uddaDog.size;
    }

    private static class NameComparator implements Comparator<Dog>{
        public int compare(Dog d1, Dog d2){
            return d1.name.compareTo(d2.name);
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }
}
