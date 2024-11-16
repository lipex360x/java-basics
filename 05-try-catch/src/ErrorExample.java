import java.text.NumberFormat;
import java.text.ParseException;

public class ErrorExample {
  public static void main(String[] args) {
    // Number value = Double.valueOf("a1.75");
    Number value;
    try {
      value = NumberFormat.getInstance().parse("a1.14");
      System.out.println(value);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
