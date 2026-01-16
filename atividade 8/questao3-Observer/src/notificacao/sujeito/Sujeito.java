package notificacao.sujeito;

import notificacao.observador.Observador;

/*
 * Interface Subject do padrão Observer.
 * Define os métodos para gerenciar os observadores.
 */
public interface Sujeito {

    void adicionarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores();
}
