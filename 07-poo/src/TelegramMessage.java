public class TelegramMessage extends MessageService {

  public void enviarMensagem() {
    this.validarConectadoInternet();
    System.out.println("Enviando Mensagem - Telegram");
    this.salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo Mensagem  - Telegram");
  }

  private void validarConectadoInternet() {
    System.out.println("Validando contectado a internet");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico");
  }
}
