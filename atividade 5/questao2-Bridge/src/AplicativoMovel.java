public class AplicativoMovel extends Controle {

    public AplicativoMovel(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDispositivo() {
        System.out.println("[Aplicativo Móvel] Ligando dispositivo...");
        dispositivo.ligar();
    }

    @Override
    public void desligarDispositivo() {
        System.out.println("[Aplicativo Móvel] Desligando dispositivo...");
        dispositivo.desligar();
    }
}

