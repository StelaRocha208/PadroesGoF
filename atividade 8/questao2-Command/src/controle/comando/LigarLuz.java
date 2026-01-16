package controle.comando;

import controle.dispositivo.Luz;

/*
 * Comando concreto para ligar a luz.
 */
public class LigarLuz implements Comando {

    private Luz luz;

    public LigarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }

    @Override
    public void desfazer() {
        luz.desligar();
    }
}
