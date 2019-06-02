package com.danf.misc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UniqueNumberTest {

  private double precision = 0.0000000000001;

  @Test
  public void sampleTestCases() {
    assertEquals(1.0, UniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
    assertEquals(2.0, UniqueNumber.findUniq(new double[]{2, 1, 1, 1, 1, 1}), precision);
    assertEquals(2.0, UniqueNumber.findUniq(new double[]{1, 2, 1, 1, 1, 1}), precision);
    assertEquals(2.0, UniqueNumber.findUniq(new double[]{1, 1, 2, 1, 1, 1}), precision);
    assertEquals(2.0, UniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);

    assertEquals(1.00000001, UniqueNumber.findUniq(new double[]{1, 1, 1, 1.00000001, 1, 1}),
        precision);
  }

  @Test(expected = IllegalArgumentException.class)
  public void noUniqueValueThrowException() {
    assertEquals(2.0, UniqueNumber.findUniq(new double[]{1, 1, 1, 1, 1, 1}), precision);

    // test should fail because precision is not precise enough
    assertEquals(1.000000000000001,
        UniqueNumber.findUniq(new double[]{1, 1, 1, 1.000000000000001, 1, 1}), precision);
  }

}
