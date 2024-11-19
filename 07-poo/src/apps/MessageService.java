package apps;

public abstract class MessageService {
  public abstract void enviarMensagem();

  public abstract void  receberMensagem();

  protected void validarConectadoInternet() {
    System.out.println("Service: : Validando contectado a internet");
  }

  protected void salvarHistorico() {
    System.out.println("Service :: Salvando histórico");
  }
}
