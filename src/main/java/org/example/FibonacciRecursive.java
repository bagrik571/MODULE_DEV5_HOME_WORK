package org.example;

public class FibonacciRecursive {
    public static long fibonacciRec (int n){
        if (n<=1){
            return n;
        }
        return fibonacciRec(n-1)+fibonacciRec(n-2);
    }
}
