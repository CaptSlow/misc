package com.danf.misc;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryTreeNodeTest {

  private static final int NODE_3_VALUE = 6;
  private static BinaryTreeNode node;

  @BeforeClass
  public static void setupNode() {
    BinaryTreeNode mynode2 = new BinaryTreeNode(4);
    BinaryTreeNode mynode3 = new BinaryTreeNode(NODE_3_VALUE);

    node = new BinaryTreeNode(2, mynode2, mynode3);
  }

  @Test
  public void quickNodeTest() {
    node.printNode();
  }

  @Test
  public void countInstancesTest() {
    Assert.assertEquals(1, node.countInstances(NODE_3_VALUE));
  }

}
