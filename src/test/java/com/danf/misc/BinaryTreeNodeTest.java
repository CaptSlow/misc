package com.danf.misc;

import org.junit.Test;

public class BinaryTreeNodeTest {

  @Test
  public void quickNodeTest() {
    BinaryTreeNode mynode3 = new BinaryTreeNode();
    BinaryTreeNode mynode2 = new BinaryTreeNode();
    BinaryTreeNode mynode1 = new BinaryTreeNode();
    mynode3.setValue(6);
    mynode2.setValue(4);
    mynode1.setValue(2);
    mynode1.setLeftNode(mynode2);
    mynode1.setRightNode(mynode3);

    mynode1.printNode();

  }

}
