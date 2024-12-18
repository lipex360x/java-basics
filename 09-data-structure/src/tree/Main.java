package tree;

import tree.model.Node;

public class Main {
  public static void main(String[] args) {
    BinaryTree<Node> tree = new BinaryTree<>();
    tree.insert(new Node(13));
    tree.insert(new Node(10));
    tree.insert(new Node(25));
    tree.insert(new Node(2));
    tree.insert(new Node(12));
    tree.insert(new Node(20));
    tree.insert(new Node(31));
    tree.insert(new Node(29));
    tree.showPreOrder();
    tree.showInOrder();
    tree.showPostOrder();
  }
}
