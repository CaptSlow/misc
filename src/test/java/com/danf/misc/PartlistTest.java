package com.danf.misc;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class PartlistTest {

  private static void testing(String actual, String expected) {
    assertEquals(expected, actual);
  }

  @Test
  public void test() {

    String[] s1 = new String[]{"cdIw", "tzIy", "xDu", "rThG"};
    String a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]";
    testing(Arrays.deepToString(Partlist.partlist(s1)), a);

    s1 = new String[]{"I", "wish", "I", "hadn't", "come"};
    a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]";
    testing(Arrays.deepToString(Partlist.partlist(s1)), a);

    s1 = new String[]{"vJQ", "anj", "mQDq", "sOZ"};
    a = "[[vJQ, anj mQDq sOZ], [vJQ anj, mQDq sOZ], [vJQ anj mQDq, sOZ]]";
    testing(Arrays.deepToString(Partlist.partlist(s1)), a);
  }

  @Test
  public void concatArrFromStartToEndTest() {
    String[] s1 = new String[]{"da", "nf", "or", "re", "st"};

    Assert.assertEquals("da nf", Partlist.concatArrFromStartOrToEnd(s1, 1, true));
    Assert.assertEquals("da nf or re st", Partlist.concatArrFromStartOrToEnd(s1, 4, true));

    Assert.assertEquals("re st", Partlist.concatArrFromStartOrToEnd(s1, 3, false));
    Assert.assertEquals("st", Partlist.concatArrFromStartOrToEnd(s1, 4, false));
  }

  @Test
  public void copyOfRangeTest() {
    String[] s1 = new String[]{"da", "nf", "or", "re", "st"};
    String[] mystr = Arrays.copyOfRange(s1, 0, s1.length - 1);
    Assert.assertEquals(4, mystr.length);
  }

}
