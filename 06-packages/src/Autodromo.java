public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("ABC1234");
    jeep.ligar();

    Moto z400 = new Moto();
    z400.setChassi("111223");
    z400.ligar();
  }
}
