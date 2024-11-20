package telephone;

public interface Telephone {
  public void call(String phoneNumber) throws Exception;
  public void receive();
  public void startVoiceMemo();
}
