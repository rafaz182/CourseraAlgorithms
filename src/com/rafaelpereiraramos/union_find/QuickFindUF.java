package com.rafaelpereiraramos.union_find;

/**
 * Quick find defect
 * - Union operation is too expensive. Takes N^2 array accesses to process sequence on N union command on N objects.
 * An quadratic algorithm. Quadratic time is much too slow. They don't scale.
 * Operation = touch the memory = array accesses
 */
public class QuickFindUF extends UF {
    
    public QuickFindUF(int N) {
        super(N);

        for(int i = 0; i < N; i++) {
            id[i] = i; // set the id of each object to itself (N array accesses)
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q]; // check whether p and q are in the same component (2 array accesses)
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p]; // get the value before changing the it
        int qid = id[q];

        //change all entries with id[p] to id[q]
        // (at most 2N + 2 array accesses)
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

}
/*
Q: What is the maximum number of id[]\verb#id[]#id[] array entries that can change (from one value to a different value)
during one call to union when using the quick-find data structure on nnn elements?
A: N - 1. In the worst case, all of the entries except id[q] are changed from id[p] to id[q].
 */