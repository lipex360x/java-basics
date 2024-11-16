public class CepFormat {
  public static void main(String[] args) {
    try {
      String formatedCep = formatCep("12.345-789");
      System.out.println(formatedCep);
    } catch (InvalidCepExample e) {
      System.out.println("Invalid CPF");
      e.printStackTrace();
    }
  }

  static String formatCep(String cep) throws InvalidCepExample {
    if(cep.length() != 8) throw new InvalidCepExample();
    return "12.456-789";
  }
}
