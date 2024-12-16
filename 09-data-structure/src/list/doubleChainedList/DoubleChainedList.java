package list.doubleChainedList;

import node.Node;
import utils.Utils;

public class DoubleChainedList<T> extends Utils<T> {
  private Node<T> firstNode;
  private Node<T> lastNode;
  private int listSize;

  public DoubleChainedList() {
    this.firstNode = null;
    this.lastNode = null;
    this.listSize = 0;
  }

  public int size() {
    return this.listSize;
  }

  public void add(T element) {
    Node<T> node = new Node<>(element);
    if (this.firstNode == null) this.firstNode = node;
    if (this.lastNode != null) this.lastNode.setNext(node);
    node.setPrev(this.lastNode);
    this.lastNode = node;
    this.listSize++;
  }

  public void add(int index, T element) {
    this.validateIndex(index);
    Node<T> node = new Node<>(element);
    if (index == 0) {
      node.setNext(this.firstNode);
      this.firstNode.setPrev(node);
      this.firstNode = node;
    } else {
      
    }

    // if (index == 0) {
    //   Node<T> auxNode = this.firstNode;
    //   node.setNext(auxNode);
    //   auxNode.setPrev(node);
    //   System.out.println(node);
    // }
    // Node<T> auxNode = this.readPosition(index);
    // System.out.println(firstNode.getPrev() + " <---- "  + auxNode + " ----> " + firstNode.getNext());
    this.listSize++;
  }

  public T get(int index) {
    this.validateIndex(index);
    // Node<T> node = this.readPosition(index);
    // System.out.println(node.getPrev() + " <---- "  + node + " ----> " + node.getNext());
    // System.out.println(node.getPrev() + " ----> "  + node + " <---- " + node.getNext());
    return this.readPosition(index).getContent();
  }

  private Node<T> readPosition(int index) {
    Node<T> auxNode = this.firstNode;
    Node<T> node = null;
    for (int i = 0; i <= index ; i++) {
      node = auxNode;
      auxNode = auxNode.getNext();
    }
    return node;
  }

  private void validateIndex(int index) {
    if (this.listSize == 0 && index > 0) throw new IndexOutOfBoundsException("invalid index (this list is empty)");
    int maxSize = this.listSize - 1;
    if (this.listSize != 0 && index > maxSize) throw new IndexOutOfBoundsException("Invalid index (max:" + (maxSize) +")");
  }

  @Override
  public String toString() {
    String returnString = this.divisor(17, "-") + "\n";
    returnString += this.divisor(6) + "List\n";
    returnString += this.divisor(17, "-") + "\n";
    returnString += this.getChainList(this.firstNode);
    returnString += this.divisor(17, "=");
    return returnString;
  }
}