public class SmartTv {
  boolean isOn = false;
  int channel = 1;
  int volume = 20;
  final int FIRST_CHANNEL = 1;
  final int LAST_CHANNEL = 150;

  public void switchOn() {
    isOn = true;
  }

  public void switchOff() {
    isOn = false;
  }

  public void increaseVolume() {
    if (volume <= 100) volume++;
  }

  public void decreaseVolume() {
    if (volume >= 0) volume--;
  }

  public void increaseChannel() {
    if (channel <= 150) channel++;
  }

  public void decreaseChannel() {
    if (channel > 0) channel--;
  }

  public void swichChannel(int newChannel) throws Exception {
    try {
      if (!isValidChannel(newChannel)) throw new Error("invalid channel");
      channel = newChannel;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public boolean isValidChannel(int channel) {
    return channel >= FIRST_CHANNEL && channel <= LAST_CHANNEL;
  }
}
