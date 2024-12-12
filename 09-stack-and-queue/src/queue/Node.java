package queue;

public class Node {
  private Object content;
  private Node referenceNode;

  public Node(Object content) {
    this.referenceNode = null;
    this.content = content;
  }

  public Object getContent() {
    return this.content;
  }

  public void setContent(Object content) {
    this.content = content;
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
