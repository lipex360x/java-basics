package tree.model;

public abstract class INode<T> implements Comparable<T> {
  public abstract boolean equals(Node object);
  public abstract int hashCode();
  public abstract int compareTo(T other);
  public abstract String toString();
}
