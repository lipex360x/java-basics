public class Computer {
  public static void main(String[] args) {
    MSNMessage msn = new MSNMessage();
    msn.enviarMensagem();
    msn.receberMensagem();

    FacebookMessage facebook = new FacebookMessage();
    facebook.enviarMensagem();
    facebook.receberMensagem();

    TelegramMessage telegram = new TelegramMessage();
    telegram.enviarMensagem();
    telegram.receberMensagem();
  }
}
