package browser;

import common.Errors;

public class Safari implements Browser {
  @Override
  public void showPage(String address) throws InvalidWebPageAddressError {
    try {
      if(!isValidWebAddress(address)) throw new InvalidWebPageAddressError();
      System.out.println("Exibindo página: " + address);
    } catch (InvalidWebPageAddressError e) {
      Errors error = Errors.INVALID_WEB_ADDRESS;
      System.err.println(error.getMessage());
      e.printStackTrace();
    }
  }

  @Override
  public void newTab() {
    System.out.println("Adicionando nova aba");
  }

  @Override
  public void refreshPage() {
    System.out.println("Atualizando página");
  }

  private boolean isValidWebAddress(String address) {
    if (address == null) return false;
    if (address.length() == 0) return false;
    return true;
  }
}
