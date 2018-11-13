package com.rameshify.coding.algorithmictoolbox;

public class Factorial {
  public long factorial(int n) {
    if (n <= 1) {
      return n;
    }
    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(new Factorial().factorial(8));
  }
}
