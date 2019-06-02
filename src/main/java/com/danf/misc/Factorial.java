package com.danf.misc;

/**
 * Class to work out factorial of a number
 */
class Factorial {

  int factorial(int n) {
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException("n must be positive or < 12");
    }
    int tot = 1;
    for (int i = 1; i < n + 1; i++) {
      tot = tot * i;
    }
    return tot;
  }
}
