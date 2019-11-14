package com.rafaelpereiraramos.union_find;

public abstract class UF {

    /**
     * Index is the object, and its value is your connection
     */
    protected int[] id;

    /**
     * Initialize the union-find data structure with N objects (0 to N-1)
     * @param N
     */
    public UF (int N) {
        id = new int[N];
    }

    /**
     * Add a connection between p and q
     * @param p
     * @param q
     */
    public abstract void union(int p, int q);

    /**
     * Are p and q in the same component?
     */
    public abstract boolean connected(int p, int q);
}