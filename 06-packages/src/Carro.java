public class Carro extends Veiculo {
  @Override
  public void ligar() {
    this.conferirCambio();
    this.conferirCombustivel();
    System.out.println("Carro Ligado");
  }

  private void conferirCambio() {
    System.out.println("Conferindo Cambio em P");
  }

  private void conferirCombustivel() {
    System.out.println("Conferindo combustível");
  }
}
