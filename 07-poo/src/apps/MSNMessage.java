package apps;

public class MSNMessage extends MessageService {
  public void enviarMensagem() {
    this.validarConectadoInternet();
    System.out.println("MSN :: Enviando Mensagem");
    this.salvarHistorico();
  }

  public void receberMensagem() {
    System.out.println("MSN :: Recebendo Mensagem\n");
  }

  protected void salvarHistorico() {
    System.out.println("MSN :: Salvando histórico");
  }

  protected void validarConectadoInternet() {
    System.out.println("MSN :: Validando contectado a internet");
  }
}
