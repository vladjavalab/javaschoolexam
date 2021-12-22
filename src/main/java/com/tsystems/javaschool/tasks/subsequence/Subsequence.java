package com.tsystems.javaschool.tasks.subsequence;

import java.util.List;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        if (x == null || y == null) throw new IllegalArgumentException();
        if (x.size() == 0) return true;

        int countA = 0, aSize = x.size();

        for(Object b : y) {
            if (b.equals(x.get(countA)) &&++countA == aSize) {
                return true;
            }
        }
        return false;
    }
}

