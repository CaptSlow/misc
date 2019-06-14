package com.danf.misc;

public class BinaryTreeNode {

  private int value;
  private BinaryTreeNode leftNode;
  private BinaryTreeNode rightNode;

  private int getValue() {
    return value;
  }

  void setValue(int value) {
    this.value = value;
  }

  public BinaryTreeNode getLeftNode() {
    return leftNode;
  }

  void setLeftNode(BinaryTreeNode leftNode) {
    this.leftNode = leftNode;
  }

  public BinaryTreeNode getRightNode() {
    return rightNode;
  }

  void setRightNode(BinaryTreeNode rightNode) {
    this.rightNode = rightNode;
  }

  void printNode(){
    System.out.println(this.getValue());
    if (leftNode != null){
      leftNode.printNode();
    }

    if (rightNode != null) {
      rightNode.printNode();
    }
  }

}
