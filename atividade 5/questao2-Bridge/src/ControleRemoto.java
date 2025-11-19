public class ControleRemoto extends Controle {

    public ControleRemoto(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDispositivo() {
        System.out.println("[Controle Remoto] Ligando dispositivo...");
        dispositivo.ligar();
    }

    @Override
    public void desligarDispositivo() {
        System.out.println("[Controle Remoto] Desligando dispositivo...");
        dispositivo.desligar();
    }
}
