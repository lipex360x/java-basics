package node;

public class Node<T> {
  private T content;
  private Node<T> referenceNode;
  private Node<T> prevNode;
  private Node<T> nextNode;

  public Node(T content) {
    this.prevNode = null;
    this.nextNode = null;
    this.content = content;
  }

  public T getContent() {
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

  public Node<T> getPrevNode() {
    return this.prevNode;
  }

  public void setPrevNode(Node<T> prevNode) {
    this.prevNode = prevNode;
  }

  public Node<T> getNextNode() {
    return this.nextNode;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  public String toString() {
    return "Node { content: " + this.content + "}";
  }

  public String chainedToString() {
    String str = this.toString();
    str += !isNextNodeNull() ? "-->" + this.nextNode.toString() : "--> null";
    return str;
  }

  private boolean isNextNodeNull() {
    return this.nextNode == null;
  }
}
