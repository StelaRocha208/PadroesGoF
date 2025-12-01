package app;

import negocio.Notificador;
import estrategia.*;

// classe teste
public class SistemaNotificacoes {

    public static void main(String[] args) {

        Notificador notificador = new Notificador();

        System.out.println("--------------------------------------------------");

        // Envio por e-mail
        notificador.setEstrategia(new EnvioEmail());
        notificador.enviarNotificacao("usuario@example.com", "Olá! Este é um e-mail de teste.");

        // Envio por SMS
        notificador.setEstrategia(new EnvioSMS());
        notificador.enviarNotificacao("+5511999999999", "Olá! Este é um SMS de teste.");

        // Envio por push notification
        notificador.setEstrategia(new EnvioPush());
        notificador.enviarNotificacao("usuario123", "Olá! Esta é uma notificação push de teste.");

        System.out.println("--------------------------------------------------");
    }
}
