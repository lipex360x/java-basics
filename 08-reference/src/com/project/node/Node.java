package com.project.node;

public class Node {
  private String content;
  private Node nextNode;

  public Node(String content) {
    this.content = content;
    this.nextNode = null;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Node getNextNode() {
    return this.nextNode;
  }

  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }

  public String toString() {
    return this.content.toString();
  }
}
