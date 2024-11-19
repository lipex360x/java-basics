package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.Multifuncional;

public class Fabrica {
  public static void main(String[] args) {
    Multifuncional multifuncional = new Multifuncional();
    Impressora impressora = multifuncional;
    Digitalizadora digitalizadora = multifuncional;
    Copiadora copiadora = multifuncional;
    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.copiar();
    Deskjet deskjet = new Deskjet();
    deskjet.imprimir();
  }
}
