package com.danf.misc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class FactorialTest {

  private Factorial fact;

  @Before
  public void initFactorial() {
    fact = new Factorial();
  }

  @After
  public void afterFactorial() {
    fact = null;
  }

  @Test
  public void test_factorial0() {
    assertEquals(1, fact.factorial(0));
  }

  @Test
  public void test_factorial3() {
    assertEquals(6, fact.factorial(3));
  }

  @Test
  public void test_factorial5() {
    assertEquals(120, fact.factorial(5));
  }

  @Test(expected = IllegalArgumentException.class)
  public void test_negative(){
    assertEquals(120, fact.factorial(-5));
  }
}
