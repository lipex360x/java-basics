package ipod;

public interface MusicApp {
  public void play() throws InvalidMusicError;
  public void pause();
  public void selectMusic(String music);
}
