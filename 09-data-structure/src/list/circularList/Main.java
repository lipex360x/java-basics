package list.circularList;

public class Main {
  public static void main(String[] args) {
    CircularList<String> list = new CircularList<>();
    list.add("node 1");
    list.add("node 2");
    list.add("node 3");
    list.add("node 4");
    System.out.println(list);
    System.out.println(list.get(3));
    System.out.println("remove: " + list.remove(3));
    list.add("node 1");
    System.out.println(list);
  }
}
