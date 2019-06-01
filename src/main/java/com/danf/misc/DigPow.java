package com.danf.misc;

public class DigPow {
	
	public static long digPow(int n, int p) {
    long tot=0;
		int[] arrN = arr(n);
    for (int i=0; i<arrN.length; i++){
      tot += pow( arrN[i], (p+i));
    }
    return (tot % n == 0) ? tot/n : -1;
	}
  
  static long pow(int a, int b){
    if ( b == 0)        return 1;
    if ( b == 1)        return a;
    if ( b % 2 == 0)    return     pow ( a * a, b/2); 
    else                return a * pow ( a * a, b/2);
  }
  
  static int[] arr(int n){
    int s=0;
    int n0 = n;
    while(n>0){
      s++;
      n = n/10;
    }
    int[] ar = new int[s];
    for (int i=0; i<s; i++){
      ar[s-i-1] = n0 % 10;
      n0 = n0 / 10;
    }
    return ar;
  }
	
}
