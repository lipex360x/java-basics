package list;

public class Main {
  public static void main(String[] args) {
    ChainedList<String> myChainedList = new ChainedList<>();
    myChainedList.add("value 1");
    myChainedList.add("value 2");
    myChainedList.add("value 3");
    myChainedList.add("value 4");
    System.out.println("show item: " + myChainedList.get(3));
    System.out.println(myChainedList);
    System.out.println("removed item:" + myChainedList.remove(2));
    System.out.println(myChainedList);
  }
}
