import java.util.*;

enum PlayerMoviment {
  ATAQUE, PAPEL, PEDRA;

  public static PlayerMoviment execute(String input) {
    switch (input.toLowerCase()) {
      case "ataque": return ATAQUE;
      case "papel": return PAPEL;
      case "pedra": return PEDRA;
      default: throw new IllegalArgumentException("Invalid moviment: " + input);
    }
  }
}

public class Problem {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N = leitor.nextInt();
    for (int i = 0; i < N; i++) {
      PlayerMoviment player1 = PlayerMoviment.execute(leitor.next());
      PlayerMoviment player2 = PlayerMoviment.execute(leitor.next());
      String result = gamePlay(player1, player2);
      System.out.println(result);
    }
    leitor.close();
  }
  
  static String gamePlay(PlayerMoviment player1, PlayerMoviment player2) {
    if (isMutualAniquilation(player1, player2)) return "Aniquilacao mutua";
    if (isBothWinners(player1, player2)) return "Ambos venceram";
    if (isPlayer1Winner(player1, player2)) return "Jogador 1 venceu";
    if (isPlayer2Winner(player1, player2)) return "Jogador 2 venceu";
    return "Sem ganhador";
  }

  static boolean isMutualAniquilation(PlayerMoviment player1, PlayerMoviment player2) {
    return player1 == PlayerMoviment.ATAQUE && player2 == PlayerMoviment.ATAQUE;
  }
  
  static boolean isBothWinners(PlayerMoviment player1, PlayerMoviment player2) {
    return player1 == PlayerMoviment.PAPEL && player2 == PlayerMoviment.PAPEL;
  }

  static boolean isPlayer1Winner(PlayerMoviment player1, PlayerMoviment player2) {
    return player1 == PlayerMoviment.ATAQUE || player2 == PlayerMoviment.PAPEL;
  }

  static boolean isPlayer2Winner(PlayerMoviment player1, PlayerMoviment player2) {
    return player2 == PlayerMoviment.ATAQUE || player1 == PlayerMoviment.PAPEL;
  }
}