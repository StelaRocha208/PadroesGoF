package estrategia;

public class EnvioPush implements EstrategiaEnvio {

    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando notificação push para " + destino + ": " + mensagem);
    }
}
