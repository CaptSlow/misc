package com.danf.misc;

/**
 * Class to take array with numbers. All numbers are equal except for one. This class finds it
 *
 * UniqueNumber.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); => 2 UniqueNumber.findUniq(new double[]{
 * 1, 2, 1, 1, 1, 1 }); => 2 UniqueNumber.findUniq(new double[]{ 2, 1, 1, 1, 1, 1 }); => 2
 * UniqueNumber.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); => 0.55 It’s guaranteed that array
 * contains more than 3 numbers.
 */
class UniqueNumber {

  static double findUniq(double[] arr) {
    double repeat;

    if (arr[0] == arr[1]) {
      repeat = arr[0];
    } else if (arr[0] == arr[2]) {
      return arr[1];
    } else {
      return arr[0];
    }
    for (double d : arr) {
      if (d != repeat) {
        return d;
      }
    }
    throw new IllegalArgumentException("No unique value found");
  }

}
