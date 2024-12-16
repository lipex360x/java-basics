package queue;

public class Main {
  public static void main(String[] args) {
    Queue<String> queue = new Queue<>();
    System.out.println(queue.first() == null);
    System.out.println(queue.toString());
    queue.enqueue("node 1");
    queue.enqueue("node 2");
    System.out.println(queue.toString());
    System.out.println(queue.first().getContent() == "node 1");
    queue.enqueue("node 3");
    queue.enqueue("node 4");
    System.out.println(queue.first().getContent() == "node 1");
    System.out.println(queue.toString());
    System.out.println(queue.dequeue());
    System.out.println(queue.toString());
    System.out.println(queue.dequeue());
    System.out.println(queue.toString());
  }
}
