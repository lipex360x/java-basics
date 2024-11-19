public class MSNMessage {
  public void enviarMensagem() {
    this.validarConectadoInternet();
    System.out.println("Enviando Mensagem");
    this.salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo Mensagem");
  }

  private void validarConectadoInternet() {
    System.out.println("Validando contectado a internet");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico");
  }
}
