package com.project.generics;

public class Node<T> {
  private T content;
  private Node<T> nextNode;

  public Node(T content) {
    this.content = content;
  }

  public T getContent() {
    return this.content;
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
    return this.content.toString();
  }
}
