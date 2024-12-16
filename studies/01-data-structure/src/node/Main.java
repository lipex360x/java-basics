package node;

public class Main {
  public static void main(String[] args) {
    Node<String> node = new Node<>("My Node");
    System.out.println(node);
    System.out.println(node.getPrevNode());
    System.out.println(node.getNextNode());
    System.out.println(node.getContent());
  }
}
