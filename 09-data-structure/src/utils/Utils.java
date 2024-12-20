package utils;

import node.Node;

public class Utils<T> {
  protected String divisor(int size) {
    return divisor(size, " ");
  }

  protected String divisor(int size, String symbol) {
    return String.format("%" + size + "s", "").replace(' ', symbol.charAt(0));
  }

  protected String getNodeData(Node<T> currentNode) {
    if (currentNode == null) return "";
    String returnString = this.divisor(5) + currentNode.getContent() + "\n";
    returnString += this.getNodeData(currentNode.getReference());
    return returnString;
  }

  protected String getListData(Node<T> currentNode) {
    if (currentNode == null) return "";
    String returnString = this.divisor(5) + currentNode.getContent() + "\n";
    returnString += this.getListData(currentNode.getNext());
    return returnString;
  }

  protected String getChainList(Node<T> currentNode) {
    if (currentNode == null) return "";
    String returnString = this.divisor(5) + currentNode.getContent() + "\n";
    returnString += this.getListData(currentNode.getNext());
    return returnString;
  }

  protected String getCircularList(Node<T> tailNode, int listSize) {
    String returnString = "";
    Node<T> auxNode = tailNode;
    for (int i = 0; i < listSize; i++) {
      returnString += this.divisor(5) + auxNode.getContent() + "\n";
      auxNode = auxNode.getNext();
    }
    return returnString;
  }
}
