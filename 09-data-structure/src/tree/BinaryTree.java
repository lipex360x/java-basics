package tree;

import node.BinNode;

public class BinaryTree <T extends Comparable<T>>{
  private BinNode<T> root;

  public BinaryTree() {
    this.root = null;
  }

  public void insert(T content) {
    BinNode<T> newNode = new BinNode<>(content);
    this.root = this.insert(this.root, newNode);
  }

  private BinNode<T> insert(BinNode<T> currentNode, BinNode<T> newNode) {
    if (currentNode == null) return newNode;
    if (newNode.getContent().compareTo(currentNode.getContent()) < 0) {
      BinNode<T> leftNode = currentNode.getLeftNode();
      currentNode.setLeftNode(insert(leftNode, newNode));
    } else {
      BinNode<T> rightNode = currentNode.getRightNode();
      currentNode.setRightNode(insert(rightNode, newNode));
    }
    return currentNode;
  }

  public void showInOrder() {
    System.out.print("\nIn Order: ");
    this.showInOrder(this.root);
  }

  private void showInOrder(BinNode<T> currentNode) {
    if (currentNode != null) {
      this.showInOrder(currentNode.getLeftNode());
      System.out.print(currentNode.getContent() + ", ");
      this.showInOrder(currentNode.getRightNode());
    }
  }

  public void showPreOrder() {
    System.out.print("\nPre Order: ");
    this.showPreOrder(this.root);
  }

  private void showPreOrder(BinNode<T> currentNode) {
    if (currentNode != null) {
      System.out.print(currentNode.getContent() + ", ");
      this.showPreOrder(currentNode.getLeftNode());
      this.showPreOrder(currentNode.getRightNode());
    }
  }

  public void showPostOrder() {
    System.out.print("\nPost Order: ");
    this.showPostOrder(this.root);
  }

  private void showPostOrder(BinNode<T> currentNode) {
    if (currentNode != null) {
      this.showPostOrder(currentNode.getLeftNode());
      this.showPostOrder(currentNode.getRightNode());
      System.out.print(currentNode.getContent() + ", ");
    }
  }
}
