package stack;

import node.Node;
import utils.Utils;

public class Stack<T> extends Utils<T> {
  Node<T> referenceNode;

  public Stack() {
    super();
    this.referenceNode = null;
  }

  public Node<T> top() {
    return this.referenceNode;
  }

  public void push(T content) {
    Node<T> lastNode = this.referenceNode;
    Node<T> newNode = new Node<>(content);
    this.referenceNode = newNode;
    this.referenceNode.setReference(lastNode);
  }

  public Node<T> pop() {
    if (this.isEmpty()) return null;
    Node<T> removedNode = this.referenceNode;
    this.referenceNode = this.referenceNode.getReference();
    return removedNode;
  }

  private boolean isEmpty() {
    return this.referenceNode == null;
  }

  @Override
  public String toString() {
    String returnString = this.divisor(17, "-") + "\n";
    returnString += this.divisor(6) + "Stack\n";
    returnString += this.divisor(17, "-") + "\n";
    returnString += this.getNodeData(this.referenceNode);
    returnString += this.divisor(17, "=");
    return returnString;
  }  
}
