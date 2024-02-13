package org.example;

import java.util.logging.Logger;

import static org.example.FibonacciDP.fibonacciDP;
import static org.example.FibonacciIteration.fibonacciIter;
import static org.example.FibonacciRecursive.fibonacciRec;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int n = 10;

        long startTimeDP = System.currentTimeMillis();
       // log.info("Start Time for FibonacciDP = " + startTimeDP);
        log.info("FibonacciDynamic(" + n + ") = " + fibonacciDP(n));
        long endTimeDP = System.currentTimeMillis();
       // log.info("End Time for FibonacciDP = " + endTimeDP);
        log.info("Time for FibonacciDP = " + (endTimeDP - startTimeDP));



        long startTimeRec = System.currentTimeMillis();
       // log.info("Start Time for FibonacciRecursive = " + startTimeRec);
        log.info("FibonacciRecursive(" + n + ") = " + fibonacciRec(n));
        long endTimeRec = System.currentTimeMillis();
       // log.info("End Time for FibonacciRecursive = " + endTimeRec);
        log.info("Time for FibonacciRecursive = " + (endTimeRec - startTimeRec));


        long startTimeIter = System.currentTimeMillis();
        //log.info("Start Time for FibonacciIteration = " + startTimeIter);
        log.info("FibonacciIteration(" + n + ") = " + fibonacciIter(n));
        long endTimeIter = System.currentTimeMillis();
        //log.info("End Time for FibonacciIteration = " + endTimeIter);
        log.info("Time for FibonacciIteration = " + (endTimeIter - startTimeIter));



    }
}