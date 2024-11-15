public class User {
  public static void main(String[] args) throws Exception {
    SmartTv lg = new SmartTv();
    showTv(lg);
    lg.switchOn();
    showTv(lg);
    for (int x = 0; x < 250; x++) {
      lg.increaseVolume();
    }
    showTv(lg);
    lg.decreaseVolume();
    showTv(lg);
    for (int x = 0; x < 250; x++) {
      lg.decreaseVolume();
    }
    showTv(lg);
    lg.increaseChannel();
    lg.increaseChannel();
    showTv(lg);
    lg.swichChannel(45);
    showTv(lg);
    lg.swichChannel(151);
    showTv(lg);
  }

  public static void showTv(SmartTv tv) {
    System.out.println();
    System.out.println("TV is On: " + tv.isOn);
    System.out.println("Current Channel: " + tv.channel);
    System.out.println("Current Volume: " + tv.volume);
    System.out.println("----------------------\n");
  }
}
