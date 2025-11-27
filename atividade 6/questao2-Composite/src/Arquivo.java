public class Arquivo implements ComponenteArquivo {

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String identacao) {
        System.out.println(identacao + "- Arquivo: " + nome);
    }

    @Override
    public void remover(ComponenteArquivo componente) {
        // Arquivo não contém outros elementos, logo não remove nada
        System.out.println("Não é possível remover de um arquivo individual.");
    }
}

