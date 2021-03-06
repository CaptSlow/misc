package com.danf.misc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceSumTest {

  @Test
  public void testBasic() {
    assertEquals("0+1+2+3+4+5+6 = 21", SequenceSum.showSequence(6));
    assertEquals("-15<0", SequenceSum.showSequence(-15));
    assertEquals("0=0", SequenceSum.showSequence(0));
  }
}
