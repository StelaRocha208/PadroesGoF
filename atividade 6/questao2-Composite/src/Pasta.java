import java.util.ArrayList;
import java.util.List;

// Classe que representa uma pasta (composite)
public class Pasta implements ComponenteArquivo {

    private String nome;
    private List<ComponenteArquivo> conteudo = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    // Adiciona arquivos ou pastas dentro desta pasta
    public void adicionar(ComponenteArquivo componente) {
        conteudo.add(componente);
    }

    @Override
    public void remover(ComponenteArquivo componente) {
        conteudo.remove(componente);
    }

    @Override
    public void exibir(String identacao) {
        System.out.println(identacao + "+ Pasta: " + nome);

        for (ComponenteArquivo c : conteudo) {
            c.exibir(identacao + "   ");
        }
    }
}
