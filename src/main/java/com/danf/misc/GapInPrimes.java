package com.danf.misc;

public class GapInPrimes {

  public static long[] gap(int g, long m, long n) {
    long[] primes = {-1L, -1L};
    boolean match=false;

    for (; m<n; m++) {
      if (isPrime(m)){
        if (primes[0]==-1){
          primes[0]=m;
        } else if (m-primes[0]==g) {
          match=true;
          primes[1]=m;
          break;
        } else {
          primes[0]=m;
        }
      }
    }
    return match ? primes : null;
  }

  static boolean isPrime(long n){
    for (int i=2; i<n/2; i++){
      if (n%i==0){
        return false;
      }
    }
    return true;
  }
}
