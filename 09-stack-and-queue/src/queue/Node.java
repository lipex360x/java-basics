package queue;

public class Node<T> {
  private T content;
  private Node<T> referenceNode;

  public Node(T content) {
    this.referenceNode = null;
    this.content = content;
  }

  public Object getContent() {
    return this.content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public Node<T> getReferenceNode() {
    return this.referenceNode;
  }

  public void setReferenceNode(Node<T> referenceNode) {
    this.referenceNode = referenceNode;
  }

  public String toString() {
    return this.content + "";
  }
}
