package browser;

public interface Browser {
  public void showPage(String address) throws InvalidWebPageAddressError;
  public void newTab();
  public void refreshPage();
}
