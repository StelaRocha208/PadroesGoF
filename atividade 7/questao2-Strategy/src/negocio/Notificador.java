package negocio;

import estrategia.EstrategiaEnvio;

public class Notificador {

    private EstrategiaEnvio estrategia;

    public void setEstrategia(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia;
    }

    public void enviarNotificacao(String destino, String mensagem) {
        if (estrategia == null) {
            System.out.println("Nenhuma estratégia de envio definida!");
        } else {
            estrategia.enviar(destino, mensagem);
        }
    }
}
