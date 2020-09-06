package Disjoint_Sets;

public class QuickFindDS implements DisjointSets {
    private int [] array;

    public QuickFindDS(int N){
        array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = i;
        }
    }

    public void connect(int p, int q){
        int pid = array[p];
        int qid = array[q];
        for(int i = 0; i < array.length; i++){
            if(array[i] == pid){
                array[i] = qid;
            }
        }
    }

    public boolean isConnected(int p, int q){
        return array[p] == array[q];
    }

}
