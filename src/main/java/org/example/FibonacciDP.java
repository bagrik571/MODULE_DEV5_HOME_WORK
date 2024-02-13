package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.logging.Logger;

public class FibonacciDP {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacciDP(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacciDP(n - 1) + fibonacciDP(n - 2);
        memo.put(n, fib);
        return fib;

    }

}
