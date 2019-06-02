package com.danf.misc;

/**
 * Class to calculate and display a sum list from 0 to given int
 * e.g. 6 returns "0+1+2+3+4+5+6 = 21"
 */
class SequenceSum {

  static String showSequence(int value) {
    if (value == 0) {
      return "0=0";
    }
    if (value < 0) {
      return (value + "<0");
    }
    StringBuilder sb = new StringBuilder();
    int tot = 0;
    for (int i = 0; i < value + 1; i++) {
      tot += i;
      sb.append(i);
      if (i == value) {
        sb.append(" = ");
        sb.append(tot);
      } else {
        sb.append("+");
      }
    }
    return sb.toString();
  }

}
