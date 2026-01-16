package notificacao.sujeito;

import java.util.ArrayList;
import java.util.List;

import notificacao.observador.Observador;

/*
 * Classe concreta que representa o Sujeito.
 * Notifica os observadores sempre que o projeto é atualizado.
 */
public class Projeto implements Sujeito {

    private String nome;
    private String ultimaAtualizacao;

    private List<Observador> observadores = new ArrayList<>();

    public Projeto(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(nome, ultimaAtualizacao);
        }
    }

    public void atualizarProjeto(String mensagem) {
        System.out.println("\nAtualizando projeto: " + mensagem);
        this.ultimaAtualizacao = mensagem;
        notificarObservadores();
    }
}
