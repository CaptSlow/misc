package com.danf.misc;

public class Misc {

  public static void main(String[] args) {
    System.out.println("Running Misc");

    int param = Integer.parseInt(args[0]);
    System.out.println(SequenceSum.showSequence(param));
  }
}
