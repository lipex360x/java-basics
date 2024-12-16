package list.chainedList;

public class Main {
  public static void main(String[] args) {
    ChainedList<String> list = new ChainedList<>();
    System.out.println(list.size() == 0);
    list.add("node 1");
    list.add("node 2");
    list.add("node 3");
    System.out.println(list.toString());
    System.out.println(list.size() == 3);
    System.out.println(list.get(1) == "node 2");
    list.add("node 4");
    System.out.println(list.remove(1));
    System.out.println(list.get(1) == "node 3");
    System.out.println(list.toString());
  }
}
