public class SistemaAutomacaoResidencial {

    public static void main(String[] args) {

        Dispositivo lampada = new Lampada();
        Dispositivo ventilador = new Ventilador();
        Dispositivo camera = new Camera();

        Controle controleRemoto = new ControleRemoto(lampada);
        Controle aplicativoMovel = new AplicativoMovel(camera);
        Controle painelParede = new PainelControle(ventilador);

        // Teste diversos controles
        controleRemoto.ligarDispositivo();
        controleRemoto.desligarDispositivo();

        aplicativoMovel.ligarDispositivo();
        aplicativoMovel.desligarDispositivo();

        painelParede.ligarDispositivo();
        painelParede.desligarDispositivo();
    }
}
