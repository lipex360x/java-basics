package queue;

public class Main {
  public static void main(String[] args) {
    Queue<String> myQueue = new Queue<>();
    myQueue.enqueue("A");
    myQueue.enqueue("B");
    myQueue.enqueue("C");
    myQueue.enqueue("D");
    System.out.println(myQueue.toString());
    System.out.println("First: " + myQueue.first());
    System.out.println("Dequeue: " + myQueue.dequeue());
    System.out.println(myQueue.toString());
    myQueue.enqueue("E");
    System.out.println(myQueue);
    System.out.println("First: " + myQueue.first());
    System.out.println("Dequeue: " + myQueue.dequeue());
    System.out.println(myQueue);
    System.out.println("First: " + myQueue.first());
  }
}
