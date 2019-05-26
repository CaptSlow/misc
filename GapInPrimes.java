import java.util.Arrays;

class GapInPrimes {
    
    public static long[] gap(int g, long m, long n) {
      long[] primes = new long[2];
      primes[0] = -1;
      primes[1] = -1;
      boolean match=false;
        
        for (; m<n; m++) {
          if (isPrime(m)){
            if (primes[0]==-1){
              primes[0]=m;
            }
            else if (primes[1]==-1){
              primes[1]=m;
              if (primes[1]-primes[0]==g) {
              match=true;
              break;
              } else {
                primes[0]=m;
                primes[1]=-1;
              }
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


