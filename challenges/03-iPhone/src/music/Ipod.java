package music;

import common.Errors;

public class Ipod implements Music {
  private String music = null;

  @Override
  public void selectMusic(String music) {
    System.out.println("Selecionando música: " + music);
    this.music = music;
  }

  @Override
  public void play() throws InvalidMusicError {
    try {
      if (!isValidMusic()) throw new InvalidMusicError(); 
      System.out.println("Tocando música: " + this.music);
    } catch (InvalidMusicError e) {
      Errors error = Errors.INVALID_MUSIC;
      System.err.println(error.getMessage());
      e.printStackTrace();
    }
   
  }

  @Override
  public void pause() {
    if (music == null) throw new Error("Nenhuma música tocando"); 
    System.out.println("Pausando música " + this.music);
  }

  private boolean isValidMusic() {
    if (this.music == null) return false;
    if (this.music.length() == 0) return false;
    return true;
  }
}
