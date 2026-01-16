package controle.comando;

import controle.dispositivo.Luz;

/*
 * Comando concreto para desligar a luz.
 */
public class DesligarLuz implements Comando {

    private Luz luz;

    public DesligarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }

    @Override
    public void desfazer() {
        luz.ligar();
    }
}

