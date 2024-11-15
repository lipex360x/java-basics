import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
  public static void main(String[] args) throws Exception {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("Por favor, digite o número da Agência");
      String agency = scanner.next();
      System.out.println("Agora, digite o numero da conta");
      int accountNumber = scanner.nextInt();
      System.out.println("Digite seu primeiro nome");
      String firstName = scanner.next();
      System.out.println("Digite seu primeiro nome");
      String lastName = scanner.next();
      System.out.println("Por fim, digite o valor do seu depósito");
      double income = scanner.nextDouble();
      String fullName = firstName.concat(" ").concat(lastName);
      System.out.println("Olá " + fullName + " obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + income + " já está disponível para saque");
    }
  }
}
