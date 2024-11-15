public class AboutMe {
  public static void main(String[] args) {
    String name = args[0];
    String lastName = args[1];
    int age = Integer.valueOf(args[2]);
    double height = Double.valueOf(args[3]);
    System.out.println("Hello, my name is " + name + " " + lastName);
    System.out.println("I am " + age);
    System.out.println("My height is " + height + "cm");
  }
}
