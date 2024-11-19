package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Impressora, Digitalizadora {

  @Override
  public void copiar() {
    System.out.println("MULTIFUNCIONAL :: COPIANDO");
  }

  @Override
  public void digitalizar() {
    System.out.println("MULTIFUNCIONAL :: DIGITALIZANDO");
  }

  @Override
  public void imprimir() {
    System.out.println("MULTIFUNCIONAL :: IMPRIMINDO");
  }
}
