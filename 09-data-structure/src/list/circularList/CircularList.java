package list.circularList;

import node.Node;
import utils.Utils;

public class CircularList<T> extends Utils<T> {
  private Node<T> header;
  private Node<T> tail;
  private int listSize;

  public CircularList() {
    this.header = null;
    this.tail = null;
    this.listSize = 0;
  }

  public void add(T element) {
    Node<T> node = new Node<>(element);
    if (this.isEmpty()) {
      this.header = node;
      this.tail = this.header;
      this.header.setNext(this.tail);
      this.listSize++;
      return;
    }
    node.setNext(this.tail);
    this.header.setNext(node);
    this.tail = node;
    this.listSize++;
  }

  public int size() {
    return this.listSize;
  }

  public T remove(int index) {
    this.validateIndex(index);
    Node<T> removedNode = this.readPosition(index);
    if (index == 0) {
      this.tail = this.tail.getNext();
      this.header.setNext(this.tail);
    } else {
      Node<T> prevNode = this.readPosition(index - 1);
      prevNode.setNext(removedNode.getNext());
      removedNode.setNext(null);
    }
    this.listSize--;
    return removedNode.getContent();
  }

  public T get(int index) {
    this.validateIndex(index);
    return this.readPosition(index).getContent();
  }

  private void validateIndex(int index) {
    if (index >= size()) throw new IndexOutOfBoundsException("Invalid index (max:" + (this.size() - 1) +")");
  }

  private boolean isEmpty() {
    return this.listSize == 0;
  }

  private Node<T> readPosition(int index) {
    Node<T> auxNode = this.tail;
    Node<T> node = null;
    for (int i = 0; i <= index ; i++) {
      node = auxNode;
      auxNode = auxNode.getNext();
    }
    return node;
  }

  @Override
  public String toString() {
    String returnString = this.divisor(17, "-") + "\n";
    returnString += this.divisor(6) + "List\n";
    returnString += this.divisor(17, "-") + "\n";
    returnString += this.getCircularList(this.tail, this.listSize);
    returnString += this.divisor(17, "=");
    return returnString;
  }
}
