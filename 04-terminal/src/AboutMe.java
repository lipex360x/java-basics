import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("Type your first name");
      String firstName = scanner.next();
      System.out.println("Type your last name");
      String lastName = scanner.next();
      System.out.println("Type your age");
      int age = scanner.nextInt();
      System.out.println("Type your height");
      double height = scanner.nextDouble();
      System.out.println("Hello, my name is " + firstName + " " + lastName);
      System.out.println("I am " + age);
      System.out.println("My height is " + height + "cm");
    }
  }
}
