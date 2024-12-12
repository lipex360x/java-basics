package stack;

public class Node {
  private int content;
  private Node referenceNode;

  public Node(int data) {
    this.referenceNode = null;
    this.content = data;
  }

  public int getContent() {
    return this.content;
  }

  public void setContent(int data) {
    this.content = data;
  }

  public Node getReferenceNode() {
    return this.referenceNode;
  }

  public void setReferenceNode(Node referenceNode) {
    this.referenceNode = referenceNode;
  }

  public String toString() {
    return this.content + "";
  }
}
