package node;

public class Node<T> {
  private T content;
  private Node<T> reference;
  private Node<T> prev;
  private Node<T> next;

  public Node(T content) {
    this.prev = null;
    this.next = null;
    this.reference = null;
    this.content = content;
  }

  public T getContent() {
    return this.content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public Node<T> getReference() {
    return this.reference;
  }

  public void setReference(Node<T> node) {
    this.reference = node;
  }

  public Node<T> getPrev() {
    return this.prev;
  }

  public void setPrev(Node<T> node) {
    this.prev = node;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public void setNext(Node<T> node) {
    this.next = node;
  }

  public String toString() {
    return "Node { content: " + this.content + " }";
  }
}
