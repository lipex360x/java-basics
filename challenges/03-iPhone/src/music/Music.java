package music;

public interface Music {
  public void play() throws InvalidMusicError;
  public void pause();
  public void selectMusic(String music);
}
