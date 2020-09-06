package Disjoint_Sets;

public class QuickUnionDS implements DisjointSets {
    private int[] parent;

    public QuickUnionDS(int n){
        parent = new int[n];

        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
    }

    public int find(int p){
        while (parent[p] >= 0){
            p = parent[p];
        }
        return p;
    }

    public void connect(int p, int q){
        int p_root = find(p);
        int q_root = find(q);
        parent[p_root] = q_root;
    }

    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }


}
