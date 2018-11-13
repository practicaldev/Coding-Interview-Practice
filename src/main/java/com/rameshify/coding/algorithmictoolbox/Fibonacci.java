package com.rameshify.coding.algorithmictoolbox;

import java.math.BigInteger;

public class Fibonacci {

  public long nthFibonacciNaive(int n) {
    if (n == 0 || n == 1) return n;
    return nthFibonacciNaive(n - 1) + nthFibonacciNaive(n - 2);
  }

  public long nthFibonacciCachedLoop(int n) {
    long[] result = new long[n + 1];
    result[1] = 1;
    for (int i = 2; i <= n; i++) {
      result[i] = result[i - 1] + result[i - 2];
    }
    return result[n];
  }

  public long nthFibonacciRecursive(int n) {
    if (n <= 1) {
      return n;
    }
    long[] result = new long[n + 1];
    result[1] = 1;
    return nthFibonacciRecursive(n, 2, result);
  }

  public long nthFibonacciRecursive(int n, int current, long[] result) {
    result[current] = result[current - 1] + result[current - 2];
    if (current == n) {
      return result[n];
    }
    return nthFibonacciRecursive(n, current + 1, result);
  }


  public BigInteger nthFibonacciBigNumber(int n) {
    if (n <= 1) {
      return BigInteger.valueOf(n);
    }
    BigInteger[] result = new BigInteger[n + 1];
    result[0] = BigInteger.ZERO;
    result[1] = BigInteger.ONE;
    return nthFibonacciBigNumber(n, 2, result);
  }

  public BigInteger nthFibonacciBigNumber(int n, int current, BigInteger[] result) {
    result[current] = result[current - 1].add(result[current - 2]);
    if (current == n) {
      return result[n];
    }
    return nthFibonacciBigNumber(n, current + 1, result);
  }

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
//    System.out.println(fibonacci.nthFibonacciCachedLoop(75));
//    System.out.println(fibonacci.nthFibonacciRecursive(75));
    System.out.println(fibonacci.nthFibonacciBigNumber(1));
    System.out.println(fibonacci.nthFibonacciBigNumber(10));
    System.out.println(fibonacci.nthFibonacciBigNumber(100));
    System.out.println(fibonacci.nthFibonacciBigNumber(200));
    System.out.println(fibonacci.nthFibonacciBigNumber(300));
    System.out.println(fibonacci.nthFibonacciBigNumber(400));
    System.out.println(fibonacci.nthFibonacciBigNumber(500));
    System.out.println(fibonacci.nthFibonacciBigNumber(1000));
//    System.out.println(fibonacci.nthFibonacciNaive(75));
  }
}
