package queue;

public class Queue {
  private Node referenceNode;

  public Queue() {
    this.referenceNode = null;
  }

  public void enqueue(Node newNode) {
    newNode.setReferenceNode(this.referenceNode);
    this.referenceNode = newNode;
  }

  public Node first() {
    if (isEmpty()) return null;
    return this.getFirstItem(this.referenceNode);
  }

  public Node dequeue() {
    Node removedElement = this.getFirstItem(this.referenceNode);
    this.referenceNode = this.removeFirstItem(this.referenceNode);
    return removedElement;
  }

  private Node removeFirstItem(Node currentNode) {
    if (currentNode == null || currentNode.getReferenceNode() == null) return null;
    currentNode.setReferenceNode(this.removeFirstItem(currentNode.getReferenceNode()));
    return currentNode;
  }

  public boolean isEmpty() {
    return this.referenceNode == null;
  }

  private Node getFirstItem(Node element) {
    if(element.getReferenceNode() == null) return element;
    return this.getFirstItem(element.getReferenceNode());
  }

  @Override
  public String toString() {
    String returnData = "-----------------\n";
    returnData += "      Queue\n";
    returnData += "-----------------\n";
    returnData += this.getQueueData(this.referenceNode);
    returnData += "\n=================";
    return returnData;
  }

  private String getQueueData(Node currentNode) {
    if(currentNode == null) return "";
    return currentNode.getContent() + " --> " + this.getQueueData(currentNode.getReferenceNode());
  }
}
