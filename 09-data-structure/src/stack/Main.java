package stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    System.out.println(stack.top() == null);
    stack.push("node 1");
    System.out.println(stack.top().getContent() == "node 1");
    stack.push("node 2");
    System.out.println(stack.top().getContent() == "node 2");
    System.out.println(stack.toString());
    System.out.println(stack.pop().getContent() == "node 2");
    System.out.println(stack.top().getContent() == "node 1");
    System.out.println(stack.pop().getContent() == "node 1");
    System.out.println(stack.top() == null);
    System.out.println(stack.toString());
  }
}
