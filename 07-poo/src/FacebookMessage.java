public class FacebookMessage extends MessageService {
  public void enviarMensagem() {
    this.validarConectadoInternet();
    System.out.println("Enviando Mensagem - Facebook");
    this.salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo Mensagem - Facebook");
  }

  private void validarConectadoInternet() {
    System.out.println("Validando contectado a internet");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico");
  }
}
