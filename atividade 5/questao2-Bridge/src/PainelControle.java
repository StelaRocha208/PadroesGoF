public class PainelControle extends Controle {

    public PainelControle(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDispositivo() {
        System.out.println("[Painel de Parede] Ligando dispositivo...");
        dispositivo.ligar();
    }

    @Override
    public void desligarDispositivo() {
        System.out.println("[Painel de Parede] Desligando dispositivo...");
        dispositivo.desligar();
    }
}
