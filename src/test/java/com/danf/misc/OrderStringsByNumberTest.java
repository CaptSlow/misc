package com.danf.misc;

import org.junit.Assert;
import org.junit.Test;

public class OrderStringsByNumberTest {

  @Test
  public void orderTest(){
    OrderStringsByNumber order = new OrderStringsByNumber();
    Assert.assertEquals("Thi1s is2 3a T4est",
        order.order("is2 Thi1s T4est 3a"));
  }

}
