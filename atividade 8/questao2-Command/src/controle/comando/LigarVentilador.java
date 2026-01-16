package controle.comando;

import controle.dispositivo.Ventilador;

/*
 * Comando concreto para ligar o ventilador.
 */
public class LigarVentilador implements Comando {

    private Ventilador ventilador;

    public LigarVentilador(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void executar() {
        ventilador.ligar();
    }

    @Override
    public void desfazer() {
        ventilador.desligar();
    }
}
