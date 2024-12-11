package stack;

public class Node {
  private int data;
  private Node referenceNode = null;

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getReferenceNode() {
    return this.referenceNode;
  }

  public void setReferenceNode(Node referenceNode) {
    this.referenceNode = referenceNode;
  }

  public String toString() {
    return "" + this.data;
  }
}
