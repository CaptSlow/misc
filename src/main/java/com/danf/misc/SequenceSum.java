package com.danf.misc;

public class SequenceSum{

  public static String showSequence(int value){
    if (value==0){
      return "0=0";
    }
    if (value < 0) {
      return (value+"<0");
    }
    StringBuilder sb = new StringBuilder();
    int tot=0;
    for(int i=0; i<value+1; i++){
      tot+=i;
      sb.append(i);
      if(i==value){
        sb.append(" = ");
        sb.append(tot);
      } else {
        sb.append("+");
      }
    }
    return sb.toString();
  }

}
