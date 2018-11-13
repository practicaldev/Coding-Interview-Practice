package com.rameshify.coding.algorithmictoolbox;

import java.math.BigInteger;

public class GreatestCommonDivisor {
  public long gcdNaive(long a, long b) {
    long gcd = 0;
    for (long i = 1; i < a + b; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }

  public long gcdEuclid(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcdEuclid(b, a % b);
  }

  public BigInteger gcdEuclid(BigInteger a, BigInteger b) {
    if (b == BigInteger.ZERO) {
      return a;
    }
    return gcdEuclid(b, a.remainder(b));
  }
}
