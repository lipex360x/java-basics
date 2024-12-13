package list;

public class Node<T> {
  private T content;
  private Node<T> nextNode;

  public T getContent() {
    return this.content;
  }

  public Node(T content) {
    this.nextNode = null;
    this.content = content;
  }

  public Node(Node<T> nextNode, T content) {
    this.nextNode = nextNode;
    this.content = content;
  }

  public void setContent(T content) {
    this.content = content;
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
