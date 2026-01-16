package controle.controle;

import controle.comando.Comando;
import java.util.Stack;

/*
 * Classe Invoker do padrão Command.
 * Responsável por executar e desfazer comandos.
 */
public class ControleRemoto {

    private Stack<Comando> historico = new Stack<>();

    public void pressionarBotao(Comando comando) {
        comando.executar();
        historico.push(comando);
    }

    public void pressionarDesfazer() {
        if (!historico.isEmpty()) {
            Comando comando = historico.pop();
            comando.desfazer();
        } else {
            System.out.println("Nenhuma ação para desfazer.");
        }
    }
}

