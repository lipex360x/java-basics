package list.chainedList;

import node.Node;
import utils.Utils;

public class ChainedList<T> extends Utils<T> {
  private Node<T> referenceNode;

  public ChainedList() {
    this.referenceNode = null;
  }

  public void add(T content) {
    Node<T> node = new Node<>(content);
    if (this.referenceNode == null) {
      this.referenceNode = node;
      return;
    }
    this.insertNode(this.referenceNode, node);
  }

  public int size() {
    return this.calculateSize(this.referenceNode);
  }

  public T get(int index) {
    return this.readPosition(index).getContent();
  }

  public T remove(int index) {
    this.validateIndex(index);
    Node<T> removedNode = this.readPosition(index);
    if (index == 0) {
      this.referenceNode = this.referenceNode.getNext();
      return removedNode.getContent();
    }
    Node<T> prevNode = this.readPosition(index - 1);
    prevNode.setNext(removedNode.getNext());
    return removedNode.getContent();
  }

  private void insertNode(Node<T> currentNode, Node<T> node) {
    if (currentNode.getNext() == null) {
      currentNode.setNext(node);
      return;
    }
    this.insertNode(currentNode.getNext(), node);
  }

  private int calculateSize(Node<T> node) {
    if (node == null) return 0;
    return 1 + this.calculateSize(node.getNext());
  }

  private Node<T> readPosition(int index) {
    this.validateIndex(index);
    Node<T> auxNode = this.referenceNode;
    Node<T> node = null;
    for (int i = 0; i <= index ; i++) {
      node = auxNode;
      auxNode = auxNode.getNext();
    }
    return node;
  }

  private void validateIndex(int index) {
    if (index >= size()) throw new IndexOutOfBoundsException("Invalid index (max:" + (this.size() - 1) +")");
  }

  @Override
  public String toString() {
    String returnString = this.divisor(17, "-") + "\n";
    returnString += this.divisor(6) + "List\n";
    returnString += this.divisor(17, "-") + "\n";
    returnString += this.getListData(this.referenceNode);
    returnString += this.divisor(17, "=");
    return returnString;
  }
}
