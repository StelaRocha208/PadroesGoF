package estrategia;

public class EnvioEmail implements EstrategiaEnvio {

    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando e-mail para " + destino + ": " + mensagem);
    }
}
