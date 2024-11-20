package common;

public enum Errors {
  INVALID_PHONE ("Telefone Inválido"),
  INVALID_WEB_ADDRESS ("Pagina web inválida"),
  INVALID_MUSIC ("Nenhuma música selecionada");

  private String message;

  private Errors(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }
}
