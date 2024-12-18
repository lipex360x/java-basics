package tree.model;

import java.util.Objects;

public class Node extends INode<Node> {
  private Integer myValue;

  public Node(Integer myValue) {
    this.myValue = myValue;
  }

  @Override
  public boolean equals(Node object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Node obj = object;
    return Objects.equals(this.myValue, obj.myValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.myValue);
  }

  @Override
  public int compareTo(Node other) {
    if (this.myValue > other.myValue) return 1;
    if (this.myValue < other.myValue) return -1;
    return 0;
  }

  @Override
  public String toString() {
    return this.myValue.toString();
  }
}
