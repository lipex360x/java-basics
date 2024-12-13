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
    if (isQueueEmpty()) return null;
    return (T) this.getFirstElementFromQueue(this.referenceNode).getContent();
  }
  
  @SuppressWarnings("unchecked")
  public T dequeue() {
    Node<T> removedElement = this.getFirstElementFromQueue(this.referenceNode);
    this.referenceNode = this.removeLastElementFromQueue(this.referenceNode);
    return (T) removedElement.getContent();
  }
  
  private Node<T> removeLastElementFromQueue(Node<T> element) {
    if (element == null || this.isReferenceElementNull(element)) return null;
    element.setReferenceNode(removeLastElementFromQueue(element.getReferenceNode()));
    return element;
  }
  
  private Node<T> getFirstElementFromQueue(Node<T> element) {
    if (this.isReferenceElementNull(element)) return element;
    return this.getFirstElementFromQueue(element.getReferenceNode());
  }

  private boolean isQueueEmpty() {
    return this.referenceNode == null;
  }

  private boolean isReferenceElementNull(Node<T> element) {
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
