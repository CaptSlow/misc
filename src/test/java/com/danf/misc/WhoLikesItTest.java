package com.danf.misc;

import org.junit.Assert;
import org.junit.Test;

public class WhoLikesItTest {

  @Test
  public void NooneLikesThisTest() {
    Assert.assertEquals("no one likes this",
        WhoLikesIt.whoLikesIt());
  }

  @Test
  public void OnePersonLikesThisTest() {
    Assert.assertEquals("Danf likes this",
        WhoLikesIt.whoLikesIt("Danf"));
  }

  @Test
  public void TwoPeopleLikeThis() {
    Assert.assertEquals("Danf and Bob like this",
        WhoLikesIt.whoLikesIt("Danf", "Bob"));
  }

  @Test
  public void ThreePeopleLikeThis() {
    Assert.assertEquals("Danf, Bob and Lil like this",
        WhoLikesIt.whoLikesIt("Danf", "Bob", "Lil"));
  }

  @Test
  public void MoreThanThreePeopleLikeThis() {
    Assert.assertEquals("Danf, Bob and 2 others like this",
        WhoLikesIt.whoLikesIt("Danf", "Bob", "Lil", "Issy"));
  }


}
