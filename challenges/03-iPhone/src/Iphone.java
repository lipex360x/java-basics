import browser.Browser;
import browser.Safari;
import music.Ipod;
import music.Music;
import telephone.Phone;
import telephone.Telephone;

public class Iphone  {
  public static void main(String[] args) throws Exception {
    Music ipod = new Ipod();
    ipod.play();
    ipod.selectMusic("Better in Collor - Lizzy");
    ipod.play();
    ipod.pause();
    ipod.play();
    Telephone phone = new Phone();
    phone.receive();
    phone.call(null);
    phone.call("+353111222333");
    Browser safari = new Safari();
    safari.showPage("www.google.com");
    safari.showPage(null);
  }
}
