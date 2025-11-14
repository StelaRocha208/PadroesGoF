public class ConexaoBD {
    private static ConexaoBD instanciaUnica;

    private boolean conectada;

    // Construtor privado 
    private ConexaoBD() {
        this.conectada = true;
        System.out.println("Conexão com o banco de dados estabelecida!");
    }

    // Método público e estático que retorna a instância única
    public static ConexaoBD getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new ConexaoBD(); 
        } else {
            System.out.println("Conexão já existente, reutilizando a mesma instância...");
        }
        return instanciaUnica;
    }

    // Método para simular uma consulta no banco
    public void executarComando(String comando) {
        if (conectada) {
            System.out.println("Executando comando: " + comando);
        } else {
            System.out.println("Não há conexão ativa com o banco!");
        }
    }
}
