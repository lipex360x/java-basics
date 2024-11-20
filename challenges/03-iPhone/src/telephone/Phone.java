package telephone;

import common.Errors;

public class Phone implements Telephone {
  @Override
  public void call(String phoneNumber) throws InvalidPhoneNumberError {
    try {
      if (!isValidPhoneNumber(phoneNumber)) throw new InvalidPhoneNumberError();
      System.out.println("Ligando para o número: " + phoneNumber);
    } catch (InvalidPhoneNumberError e) {
      Errors error = Errors.INVALID_PHONE;
      System.err.println(error.getMessage());
      e.printStackTrace();
    }
  }

  @Override
  public void receive() {
    System.out.println("Atendendo ligação");
  }

  @Override
  public void startVoiceMemo() {
    System.out.println("Iniciando correio de voz");
  }

  private boolean isValidPhoneNumber(String phone) {
    if (phone == null) return false;
    if (phone.length() == 0) return false;
    return true;
  }
}
