package stack;

public class Main {
  public static void main(String[] args) {
    Stack firstStack = new Stack();
    firstStack.push(new Node(1));
    firstStack.push(new Node(2));
    firstStack.push(new Node(3));
    firstStack.push(new Node(4));
    firstStack.push(new Node(5));
    firstStack.push(new Node(6));
    System.out.println(firstStack.toString());
    System.out.println("Popped Data: " + firstStack.pop());
    System.out.println(firstStack.toString());
  }
}
