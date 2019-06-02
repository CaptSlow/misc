package com.danf.misc;

import org.junit.Assert;
import org.junit.Test;

public class DigPowTest {

  @Test
  public void digPowTest() {
    Assert.assertEquals(8, DigPow.pow(2, 3));
    Assert.assertEquals(9, DigPow.pow(3, 2));

    int[] ar = {5, 1, 2};
    Assert.assertArrayEquals(ar, DigPow.arr(512));

    Assert.assertEquals(-1, DigPow.digPow(512, 2));
    //todo: test happy path
  }

}
