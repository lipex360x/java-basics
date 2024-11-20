package phone;

public interface Telephone {
  public void call(String numero) throws Exception;
  public void receive();
  public void startVoiceMemo();
}
