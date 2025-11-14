public class SistemaFinanceiro {
    public static void main(String[] args) {
        System.out.println("=== Sistema Financeiro Iniciado ===");

        // Primeira tentativa de conexão
        ConexaoBD conexao1 = ConexaoBD.getInstance();
        conexao1.executarComando("SELECT * FROM transacoes");

        System.out.println();

        // Segunda tentativa de conexão 
        ConexaoBD conexao2 = ConexaoBD.getInstance();
        conexao2.executarComando("INSERT INTO relatorios VALUES ('Relatório Mensal')");

        System.out.println();

        // Verificando se as duas variáveis apontam para o mesmo objeto
        if (conexao1 == conexao2) {
            System.out.println("Ambas as conexões são a MESMA instância (Singleton funcionando corretamente).");
        } else {
            System.out.println("As conexões são diferentes (erro na implementação do Singleton).");
        }

        System.out.println("=== Sistema Finalizado ===");
    }
}
