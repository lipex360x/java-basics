package queue;

public class Main {
  public static void main(String[] args) {
    Queue myQueue = new Queue();
    myQueue.enqueue(new Node("A"));
    myQueue.enqueue(new Node("B"));
    myQueue.enqueue(new Node("C"));
    myQueue.enqueue(new Node("D"));
    // System.out.println(myQueue.toString());
    // System.out.println("First: " + myQueue.first());
    System.out.println("Dequeue: " + myQueue.dequeue());
    System.out.println(myQueue.toString());
  }
}
