package list.doubleChainedList;

public class Main {
  public static void main(String[] args) {
    DoubleChainedList<String> list = new DoubleChainedList<>();
    list.add("node 1");
    list.add("node 2");
    list.add("node 3");
    System.out.println(list.toString());
    System.out.println("size: " + list.size());
    list.add(0, "test");
    System.out.println("size: " + list.size());
    System.out.println(list.toString());
    System.out.println(list.get(0));
  }
}
