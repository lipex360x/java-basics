package stack;

import node.Node;

public class Stack<T> {
  Node<T> referenceNode;

  public Stack() {
    this.referenceNode = null;
  }

  public Node<T> top() {
    return this.referenceNode;
  }

  public void push(T content) {
    Node<T> lastNode = this.referenceNode;
    Node<T> newNode = new Node<>(content);
    this.referenceNode = newNode;
    this.referenceNode.setReferenceNode(lastNode);
  }

  public Node<T> pop() {
    if (this.isEmpty()) return null;
    Node<T> removedNode = this.referenceNode;
    this.referenceNode = this.referenceNode.getReferenceNode();
    return removedNode;
  }

  private boolean isEmpty() {
    return this.referenceNode == null;
  }

  @Override
  public String toString() {
    String returnString = "-----------------\n";
    returnString += "      Stack\n";
    returnString += "-----------------\n";
    returnString += this.getNodeData(this.referenceNode);
    returnString += "=================";
    return returnString;
  }

  private String getNodeData(Node<T> currentNode) {
    if(currentNode == null) return "";
    String returnString = String.format("%5s", "");
    returnString += currentNode.getContent();
    returnString += "\n";
    returnString += this.getNodeData(currentNode.getReferenceNode());
    return returnString;
  }
}
