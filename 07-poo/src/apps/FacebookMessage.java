package apps;

public class FacebookMessage extends MessageService {
  public void enviarMensagem() {
    this.validarConectadoInternet();
    System.out.println("Facebook :: Enviando Mensagem");
    this.salvarHistorico();
  }

  public void receberMensagem() {
    System.out.println("Facebook :: Recebendo Mensagem\n");
  }
}
