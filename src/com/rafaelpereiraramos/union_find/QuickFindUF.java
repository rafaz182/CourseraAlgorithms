package com.rafaelpereiraramos.union_find;

public class QuickFindUF extends UF {
    
    public QuickFindUF(int N) {
        super(N);

        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {

    }

    @Override
    public boolean connected(int p, int q) {
        return false;
    }

}