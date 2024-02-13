package org.example;

public class FibonacciIteration {
    public static long fibonacciIter (int n){
        if (n<=1){
            return n;
        }

        long prev = 0;
        long curr = 1;
        long next;

        for (int i = 2; i <= n; i++) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
