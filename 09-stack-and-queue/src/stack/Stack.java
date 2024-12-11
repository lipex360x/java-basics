package stack;

public class Stack {
  private Node referenceNode;
  
  public Stack() {
    this.referenceNode = null;
  }

  public Node top() {
    return this.referenceNode;
  }

  public void push(Node newNode) {
    Node olderReferenceNode = this.referenceNode;
    this.referenceNode = newNode;
    this.referenceNode.setReferenceNode(olderReferenceNode);
  }

  public Node pop() {
    if(this.isEmpty()) return null;
    Node poppedNode = this.referenceNode;
    this.referenceNode = this.referenceNode.getReferenceNode();
    return poppedNode;
  }

  public boolean isEmpty() {
    return this.referenceNode == null;
  }

  @Override
  public String toString() {
    String returnData = "-----------------\n";
    returnData += "      Stack\n";
    returnData += "-----------------\n";
    returnData += this.getStackData(this.referenceNode);
    returnData += "=================";
    return returnData;
  }

  private String getStackData(Node currentNode) {
    if(currentNode == null) return "";
    return currentNode.getData() + "\n" + this.getStackData(currentNode.getReferenceNode());
  }
}
