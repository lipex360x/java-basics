package queue;

import node.Node;
import utils.Utils;

public class Queue<T> extends Utils<T> {
  private Node<T> referenceNode;

  public Queue() {
    this.referenceNode = null;
  }

  public Node<T> first() {
    if (this.isEmpty()) return null;
    return this.getFirstNode(this.referenceNode);
  }

  public void enqueue(T content) {
    Node<T> node = new Node<>(content);
    node.setReference(this.referenceNode);
    this.referenceNode = node;
  }

  public T dequeue() {
    Node<T> removedNode = this.getFirstNode(this.referenceNode);
    this.referenceNode = this.removeFirstNode(this.referenceNode);
    return removedNode.getContent();
  }

  private boolean isEmpty() {
    return this.referenceNode == null;
  }

  private Node<T> getFirstNode(Node<T> node) {
    if (node.getReference() == null) return node;
    return this.getFirstNode(node.getReference());
  }

  private Node<T> removeFirstNode(Node<T> node) {
    if (node == null || node.getReference() == null) return null;
    Node<T> nextNode = this.removeFirstNode(node.getReference());
    node.setReference(nextNode);
    return node;
  }

  @Override
  public String toString() {
    String returnString = this.divisor(17, "-") + "\n";
    returnString += this.divisor(6) + "Queue\n";
    returnString += this.divisor(17, "-") + "\n";
    returnString += this.getNodeData(this.referenceNode);
    returnString += this.divisor(17, "=");
    return returnString;
  }
}
