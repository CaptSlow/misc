package com.danf.misc;

/**
 * Class to return different arrangements of a given string array
 */
class Partlist {

  static String[][] partlist(String[] arr) {
    String[][] partList = new String[arr.length - 1][2];
    for (int i = 0; i < arr.length - 1; i++) {
      partList[i][0] = concatArrFromStartOrToEnd(arr, i, true);
      partList[i][1] = concatArrFromStartOrToEnd(arr, i + 1, false);
    }
    return partList;
  }

  static String concatArrFromStartOrToEnd(String[] arr, int index, boolean fromStart) {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    int limit = index;
    if (!fromStart) {
      i = index;
      limit = arr.length - 1;
    }
    for (; i < limit + 1; i++) {
      sb.append(arr[i]);
      if (i != limit) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }

  //  public static String[][] partlistsolution(String[] arr) {
//    String[][] partList = new String[arr.length - 1][2];
//    for (int i = 0; i < arr.length - 1; i++) {
//      partList[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i+1));
//      partList[i][1] = String.join(" ", Arrays.copyOfRange(arr, 0, i+1));
//    }
//    return partList;
//  }

}
