public class User {
  public static void main(String[] args) throws Exception {
    SmartTv lg = new SmartTv();
    showTv(lg);
    lg.switchOn();
    showTv(lg);
  }

  public static void showTv(SmartTv tv) {
    System.out.println("\n----------------------");
    System.out.println("TV is On: " + tv.isOn);
    System.out.println("Current Channel: " + tv.channel);
    System.out.println("Current Volume: " + tv.volume);
    System.out.println("----------------------");
  }
}
