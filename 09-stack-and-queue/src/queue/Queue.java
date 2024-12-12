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
    return getFirstItem(this.referenceNode);
  }

  public Node dequeue() {
    Node removedElement = this.getFirstItem(this.referenceNode);
    Node lastElement = this.referenceNode;
    Node aux = this.referenceNode;
    while (true) {
      if(lastElement.getReferenceNode() != null) {
        aux = lastElement;
        lastElement = lastElement.getReferenceNode();
      } else {
        aux.setReferenceNode(null);
        break;
      }
    }
    System.out.println("Last element: " + lastElement);
    return removedElement;
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
