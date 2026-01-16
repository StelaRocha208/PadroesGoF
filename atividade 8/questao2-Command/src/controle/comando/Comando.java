package controle.comando;

/*
 * Interface Command do padrão Command.
 * Define os métodos que todos os comandos devem implementar.
 */
public interface Comando {

    void executar();

    void desfazer();
}

