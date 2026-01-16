package controle.comando;

import controle.dispositivo.Ventilador;

public class DesligarVentilador implements Comando {

    private Ventilador ventilador;

    public DesligarVentilador(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void executar() {
        ventilador.desligar();
    }

    @Override
    public void desfazer() {
        ventilador.ligar();
    }
}
