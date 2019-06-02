package com.danf.misc;

class DigPow {

  /**
   * The whole 512 becomes tot = 5^p + 1^(p+1) + 2^(p+2) is divisible by 512, business
   *
   * @param n int to be split into single digits and checked
   * @param p power to start and increment from
   * @return the result of tot/n
   */
  static long digPow(int n, int p) {
    long tot = 0;
    int[] arrN = arr(n);
    for (int i = 0; i < arrN.length; i++) {
      tot += pow(arrN[i], (p + i));
    }
    return (tot % n == 0) ? tot / n : -1;
  }

  /**
   * returns value of a^b
   *
   * @param a number being raised to power of b
   * @param b value of the power
   * @return a^b
   */
  static long pow(int a, int b) {
    if (b == 0) {
      return 1;
    }
    if (b == 1) {
      return a;
    }
    if (b % 2 == 0) {
      return pow(a * a, b / 2);
    } else {
      return a * pow(a * a, b / 2);
    }
  }

  /**
   * returns an int as an array of single digit ints
   *
   * @param n an int to be split up
   * @return int array of n split into constituent digits
   */
  static int[] arr(int n) {
    int s = 0;
    int n0 = n;
    while (n > 0) {
      s++;
      n = n / 10;
    }
    int[] ar = new int[s];
    for (int i = 0; i < s; i++) {
      ar[s - i - 1] = n0 % 10;
      n0 = n0 / 10;
    }
    return ar;
  }

}
