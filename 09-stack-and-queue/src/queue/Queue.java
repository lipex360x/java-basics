package queue;

public class Queue<T> {
  private Node<T> referenceNode;
  
  public Queue() {
    this.referenceNode = null;
  }
  
  public void enqueue(T object) {
    Node<T> newNode = new Node<>(object);
    newNode.setReferenceNode(this.referenceNode);
    this.referenceNode = newNode;
  }
  
  @SuppressWarnings("unchecked")
  public T first() {
    if (isEmpty()) return null;
    return (T) this.getFirstItem(this.referenceNode).getContent();
  }
  
  @SuppressWarnings("unchecked")
  public T dequeue() {
    Node<T> removedElement = this.getFirstItem(this.referenceNode);
    this.referenceNode = this.removeLastElement(this.referenceNode);
    return (T) removedElement.getContent();
  }
  
  private Node<T> removeLastElement(Node<T> element) {
    if (element == null || element.getReferenceNode() == null) return null;
    element.setReferenceNode(removeLastElement(element.getReferenceNode()));
    return element;
  }
  
  public boolean isEmpty() {
    return this.referenceNode == null;
  }
  
  private Node<T> getFirstItem(Node<T> element) {
    if (this.isElementNull(element)) return element;
    return this.getFirstItem(element.getReferenceNode());
  }

  private boolean isElementNull(Node<T> element) {
    return element.getReferenceNode() == null;
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
  
  private String getQueueData(Node<T> currentNode) {
    if (currentNode == null) return "";
    return currentNode.getContent() + " --> " + this.getQueueData(currentNode.getReferenceNode());
  }
}
