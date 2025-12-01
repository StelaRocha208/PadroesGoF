package estrategia;

public class EnvioSMS implements EstrategiaEnvio {

    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para " + destino + ": " + mensagem);
    }
}
