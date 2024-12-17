package node;

import utils.Utils;

public class BinNode<T extends Comparable<T>> extends Utils<T> {
  private T content;
  private BinNode<T> leftNode;
  private BinNode<T> rightNode;

  public BinNode(T content) {
    this.content = content;
    this.leftNode = null;
    this.rightNode = null;
  }

  public T getContent() {
    return this.content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public BinNode<T> getLeftNode() {
    return this.leftNode;
  }

  public void setLeftNode(BinNode<T> leftNode) {
    this.leftNode = leftNode;
  }

  public BinNode<T> getRightNode() {
    return this.rightNode;
  }

  public void setRightNode(BinNode<T> rightNode) {
    this.rightNode = rightNode;
  }

  public String toString() {
    return "Node { content: " + this.content + " }";
  }
}
