package apps;

public class TelegramMessage extends MessageService {
  public void enviarMensagem() {
    this.validarConectadoInternet();
    System.out.println("Telegram :: Enviando Mensagem");
    this.salvarHistorico();
  }

  public void receberMensagem() {
    System.out.println("Telegram :: Recebendo Mensagem\n");
  }
}
