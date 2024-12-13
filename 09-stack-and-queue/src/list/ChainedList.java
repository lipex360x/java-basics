package list;

public class ChainedList<T> {
  Node<T> refNode;
  
  public ChainedList() {
    this.refNode = null;
  }
  
  public boolean isEmpty() {
    return this.refNode == null;
  }
  
  public int size() {
    return calculateSize(this.refNode);
  }
  
  public void add(T content) {
    Node<T> newNode = new Node<>(content);
    if (this.isEmpty()) {
      this.refNode = newNode;
      return;
    }
    this.addNode(this.refNode, newNode);
  }

  public T get(int index) {
    return getNode(index).getContent();
  }

  public T remove(int index) {
    this.validateIndex(index);
    Node<T> node = getNode(index);
    if (index == 0)  {
      this.refNode = refNode.getNextNode();
      return node.getContent();
    }
    Node<T> prevNode = this.getNode(index - 1);
    prevNode.setNextNode(node.getNextNode());
    return node.getContent();
  }

  private Node<T> getNode(int index) {
    this.validateIndex(index);
    Node<T> auxNode = this.refNode;
    Node<T> node = null;
    for (int i = 0; i <= index; i ++){
      node = auxNode;
      auxNode = auxNode.getNextNode();
    }
    return node;
  }

  private void validateIndex(int index) {
    if (index >= size()) throw new IndexOutOfBoundsException("Invalid index (max:" + (this.size() - 1) +")");
  }
  
  private void addNode(Node<T> currentNode, Node<T> newNode) {
    if (currentNode.getNextNode() == null) {
      currentNode.setNextNode(newNode);
      return;
    } 
    this.addNode(currentNode.getNextNode(), newNode);
  }
  
  private int calculateSize(Node<T> currentNode) {
    if (currentNode == null) return 0;
    return 1 + calculateSize(currentNode.getNextNode());
  }

  @Override
  public String toString() {
    String str = "---------------\n";;
    Node<T> auxNode = this.refNode;
    for (int i = 0; i < this.size(); i++) {
      str += "Node { content: " + auxNode.getContent() + "}\n";
      auxNode = auxNode.getNextNode();
    }
    str += "---------------";
    return str;
  }
}
